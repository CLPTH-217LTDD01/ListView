package com.example.ducthuan.mnngonmingy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String  Item[] = {"Cà tím nhồi thịt sốt dầu hào", "Tôm rim dưa", "Bánh gấc nhân đậu xanh", "Rong biển cuộn tôm thịt", "Thịt kho dừa", "Mứt cam mật"};
    String  SubItem[] = {"11 Nguyên Liệu.",
            "9 Nguyên Liệu.",
            "12 Nguyên Liệu.",
            "8 Nguyên Liệu.",
            "6 Nguyên Liệu.",
            "4 Nguyên Liệu."};
    int flags[] = {R.drawable.hinh_1, R.drawable.hinh_2, R.drawable.hinh_3, R.drawable.hinh_4, R.drawable.hinh_5, R.drawable.hinh_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}