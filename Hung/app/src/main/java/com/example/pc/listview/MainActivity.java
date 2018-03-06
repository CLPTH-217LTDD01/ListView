package com.example.pc.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ListView;

import com.example.pc.adapter.DanhBaAdapter;
import com.example.pc.model.DanhBa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhBa;
    ArrayList<DanhBa>dsDanhBa;
    DanhBaAdapter danhBaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        lvDanhBa=findViewById(R.id.lvDanhBa);
        dsDanhBa=new ArrayList<>();
        dsDanhBa.add(new DanhBa(1,"NSH_No1","096154689"));
        dsDanhBa.add(new DanhBa(2,"Lol.SiRaNo","0981220797"));
        dsDanhBa.add(new DanhBa(3,"CalKaiL","0961458752"));
        dsDanhBa.add(new DanhBa(4,"LinhT4","01698328529"));
        dsDanhBa.add(new DanhBa(5,"TeoIS","0961547866"));
        dsDanhBa.add(new DanhBa(6,"PhuocMĐ","0961547856"));
        dsDanhBa.add(new DanhBa(7,"SinS2","0961547856"));
        dsDanhBa.add(new DanhBa(8,"Nguyễn Thị Thiên Thu","0961547856"));

        danhBaAdapter=new DanhBaAdapter(MainActivity.this,R.layout.item,dsDanhBa);
        lvDanhBa.setAdapter(danhBaAdapter);
    }
}
