package com.example.pavilion.linh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvtraicay;
    ArrayList<Traicay> arraytraicay;
    TraicayAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvtraicay = (ListView) findViewById(R.id.lvFruit);
        arraytraicay = new ArrayList<>();

        arraytraicay.add(new Traicay("Apple", R.drawable.apple));
        arraytraicay.add(new Traicay("Coconut", R.drawable.coconut));
        arraytraicay.add(new Traicay("Lemon", R.drawable.lemon));
        arraytraicay.add(new Traicay("Banana", R.drawable.chuoi));
        arraytraicay.add(new Traicay("Grape", R.drawable.nho));
        arraytraicay.add(new Traicay("Tomato", R.drawable.tomato));
        arraytraicay.add(new Traicay("Mangoes", R.drawable.xoai));
        arraytraicay.add(new Traicay("Pomegranate", R.drawable.luu));
        arraytraicay.add(new Traicay("Strawberry", R.drawable.dt));
        arraytraicay.add(new Traicay("Mangossteen", R.drawable.mc));
        arraytraicay.add(new Traicay("Watermelon", R.drawable.dh));

        fruitAdapter = new TraicayAdapter(this, R.layout.row_fruit, arraytraicay);

        lvtraicay.setAdapter(fruitAdapter);
    }

}
