package com.example.pavilion.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by PAVILION on 3/5/2018.
 */

public class traicay_adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private list <Traicay> traicaylist;

    public traicay_adapter(Context context, int layout, list <Traicay> traicaylist) {
        this.context = context;
        this.layout = layout;
        this.traicaylist = traicaylist;
    }

    @Override
    public int getCount() {
        return traicaylist. ize();
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
        LayoutInflater inflater (LayoutInflater) Context     return null;
    }
}
