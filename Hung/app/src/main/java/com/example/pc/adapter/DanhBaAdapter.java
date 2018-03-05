package com.example.pc.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.pc.listview.R;
import com.example.pc.model.DanhBa;

import java.util.List;

/**
 * Created by PC on 3/5/2018.
 */

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    Activity context; int resource;  List<DanhBa> objects;
    public DanhBaAdapter(Activity context, int resource,  List<DanhBa> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);
        TextView txtTen=row.findViewById(R.id.txtTen);
        TextView txtPhone=row.findViewById(R.id.txtPhone);
        ImageButton btnCall=row.findViewById(R.id.btnCall);
        ImageButton btnSms=row.findViewById(R.id.btnSms);
        ImageButton btnLich=row.findViewById(R.id.btnLich);
        ImageButton btnNote=row.findViewById(R.id.btnNote);
        DanhBa db=this.objects.get(position);
        txtTen.setText(db.getTen());
        txtPhone.setText(db.getPhone());

        return row;
    }
}
