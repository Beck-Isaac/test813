package com.example.administrator.myapplication813;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data data1 = new Data("김만두","오늘 날씨 완전 덥다;");
        Data data2 = new Data("박찐빵","치킨 먹을 @우삼겹 구함");
        Data data3 = new Data("최콜라","방학 3주 남은거 실화?");

        ArrayList<Data> userlist = new ArrayList<>();
        userlist.add(data1);
        userlist.add(data2);
        userlist.add(data3);

        KaKaoAdapter adapter = new KaKaoAdapter(userlist, this);
        ListView listView = findViewById(R.id.friendList);
        listView.setAdapter(adapter);
    }
}
