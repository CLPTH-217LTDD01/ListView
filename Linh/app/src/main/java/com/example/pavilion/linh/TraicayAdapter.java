package com.example.pavilion.linh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PAVILION on 3/6/2018.
 */

public class TraicayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Traicay> traicayList;

    public TraicayAdapter(Context context, int layout, List<Traicay> traicayList) {
        this.context = context;
        this.layout = layout;
        this.traicayList = traicayList;
    }

    @Override

    public int getCount() {
        return traicayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= layoutInflater.inflate(layout,null);
        TextView txtten=(TextView) view.findViewById(R.id.textviewten);
        ImageView imghinh=(ImageView) view.findViewById(R.id.imageviewhinh);
        Traicay traicay=traicayList.get(i);
        txtten.setText(traicay.getTen());
        imghinh.setImageResource(traicay.getHinh());

        return view;
    }
}
