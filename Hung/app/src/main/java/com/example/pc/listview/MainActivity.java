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
        dsDanhBa.add(new DanhBa(1,"Nguyễn Sỹ Hùng","096154689"));
        dsDanhBa.add(new DanhBa(2,"Nguyễn Thanh Tuyền","0958457245"));
        dsDanhBa.add(new DanhBa(3,"Nguyễn Quốc Cường","0961458752"));
        dsDanhBa.add(new DanhBa(4,"Nguyễn Thị Thiên Thu","0961547856"));

        danhBaAdapter=new DanhBaAdapter(MainActivity.this,R.layout.item,dsDanhBa);
        lvDanhBa.setAdapter(danhBaAdapter);
    }
}
