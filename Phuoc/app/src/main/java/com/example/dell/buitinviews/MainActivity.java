package com.example.dell.buitinviews;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CustomAdapter adapter;
    ListView lvDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvDemo=(ListView) findViewById(R.id.lvDemo);
        ArrayList<List> alList=new ArrayList<>();

        List list1=new List("Vegetables","65 items");
        List list2=new List("Fruits","17 items");
        List list3=new List("Flower Buds","5 items");
        List list4=new List("Legumes","33 items");
        List list5=new List("Bulbs","18 items");
        List list6=new List("Tubers","43 items");

        alList.add(list1);
        alList.add(list2);
        alList.add(list3);
        alList.add(list4);
        alList.add(list5);
        alList.add(list6);

        adapter = new CustomAdapter(this, R.layout.row_listview, alList);
        lvDemo.setAdapter(adapter);

    }
}
