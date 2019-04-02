package com.example.administrator.mylistviewdemotwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //列表控件
    ListView listView;
    //将实体类存放在集合中
    List<FruitDataBean> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_view);
        //数据
        setFruitData();
        //自定义适配器
        ListFruitAdapter adapter=new ListFruitAdapter(MainActivity.this,R.layout.item_fruit,list);
        //绑定适配器
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
    private void setFruitData(){
        for (int i=0;i<30;i++){
            FruitDataBean fruitDataBean=new FruitDataBean("apple"+i,R.drawable.ic_launcher_background);
            list.add(fruitDataBean);
        }

    }
}
