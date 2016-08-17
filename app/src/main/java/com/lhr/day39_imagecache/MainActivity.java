package com.lhr.day39_imagecache;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.lv);
        list=new ArrayList<>();
        for (int i=0;i<30;i++){
            list.add("汤唯"+i);
        }
        MyAdapter adapter=new MyAdapter(this,list);
        lv.setAdapter(adapter);
    }
}
