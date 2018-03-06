package com.example.dell.buitinviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 3/4/2018.
 */

public class CustomAdapter extends ArrayAdapter<List>{
    private Context context;
    private int resource;
    private ArrayList<List> lists;

    public CustomAdapter(Context context,int resource,ArrayList<List> lists){
        super(context,resource,lists);
        this.context=context;
        this.resource=resource;
        this.lists=lists;
    }
@Override
    public View getView(int position, View convertView, ViewGroup parent) {
         LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View list_row = inflater.inflate(R.layout.row_listview, null, true);

         TextView tvName = (TextView) list_row.findViewById(R.id.txtName);
         TextView tvItem = (TextView) list_row.findViewById(R.id.txtItem);


         tvName.setText(lists.get(position).getName());
         tvItem.setText(lists.get(position).getItem());

         return list_row;

    }

}
