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
        Anhxa();
        fruitAdapter = new TraicayAdapter(this, R.layout.row_fruit, arraytraicay);

        lvtraicay.setAdapter(fruitAdapter);
    }

    private void Anhxa() {
        lvtraicay = (ListView) findViewById(R.id.listviewtraicay);
        arraytraicay = new ArrayList<>();
        arraytraicay.add(new Traicay("APPLE", R.drawable.apple));
        arraytraicay.add(new Traicay("BANANA", R.drawable.banana));
        arraytraicay.add(new Traicay("coconut", R.drawable.coconut));
        arraytraicay.add(new Traicay("LEMON", R.drawable.lemon));
        arraytraicay.add(new Traicay("KIWI", R.drawable.kiwi));
    }

}
