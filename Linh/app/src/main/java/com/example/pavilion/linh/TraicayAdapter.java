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
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View single_row = layoutInflater.inflate(layout, null, true);

        TextView txtten = (TextView) single_row.findViewById(R.id.textviewten);
        ImageView imghinh = (ImageView) single_row.findViewById(R.id.imageviewhinh);
        txtten.setText(traicayList.get(i).getTen());
        imghinh.setImageResource(traicayList.get(i).getHinh());

        return single_row;
    }
}
