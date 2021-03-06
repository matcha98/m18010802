package com.matcha.m18010802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ArrayList<Map<String,Object>> myList=new ArrayList();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listView);
        HashMap<String,Object> m1=new HashMap();
        m1.put("city","台北");
        m1.put("code","02");
        m1.put("img",R.drawable.tpe);
        HashMap<String,Object> m2=new HashMap();
        m2.put("city","台中");
        m2.put("code","04");
        m2.put("img",R.drawable.tc);
        HashMap<String,Object> m3=new HashMap<>();
        m3.put("city","台南");
        m3.put("code","06");
        m3.put("img",R.drawable.tn);
        HashMap<String,Object> m4=new HashMap<>();
        m4.put("city","高雄");
        m4.put("code","07");
        m4.put("img",R.drawable.kh);

        myList.add(m1);
        myList.add(m2);
        myList.add(m3);
        myList.add(m4);

        SimpleAdapter adapter= new SimpleAdapter(
                MainActivity.this,myList,R.layout.myitem,
                new String[]{"city","code","img"},
                new int[]{R.id.textView,R.id.textView2,R.id.imageView});

        lv.setAdapter(adapter);
    }
}
