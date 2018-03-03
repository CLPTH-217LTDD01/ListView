package com.example.quocc.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Song> {
    private Context context;
    private int resource;
    private ArrayList<Song> songs;

    public CustomAdapter(Context context, int resource, ArrayList<Song> songs) {
        super(context, resource, songs);
        this.resource = resource;
        this.context = context;
        this.songs = songs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View single_row = inflater.inflate(R.layout.row_listview, null, true);

        ImageView ivSong = (ImageView) single_row.findViewById(R.id.imageSong);
        ImageView ivView = (ImageView) single_row.findViewById(R.id.imageView);
        ImageView ivLike = (ImageView) single_row.findViewById(R.id.imageLike);
        ImageView ivDislike = (ImageView) single_row.findViewById(R.id.imageDislike);
        TextView tvSong = (TextView) single_row.findViewById(R.id.txtSong);
        TextView tvSinger = (TextView) single_row.findViewById(R.id.txtSinger);
        TextView tvView = (TextView) single_row.findViewById(R.id.txtView);
        TextView tvLike = (TextView) single_row.findViewById(R.id.txtLike);
        TextView tvDislike = (TextView) single_row.findViewById(R.id.txtDislike);

        ivSong.setImageResource(songs.get(position).getImageSongID());
        ivView.setImageResource(songs.get(position).getImageView());
        ivLike.setImageResource(songs.get(position).getImageLike());
        ivDislike.setImageResource(songs.get(position).getImageDislike());
        tvSong.setText(songs.get(position).getName());
        tvSinger.setText(songs.get(position).getSinger());
        tvView.setText("" + songs.get(position).getView());
        tvLike.setText("" + songs.get(position).getLike());
        tvDislike.setText("" + songs.get(position).getDislike());

        return single_row;
    }
}
