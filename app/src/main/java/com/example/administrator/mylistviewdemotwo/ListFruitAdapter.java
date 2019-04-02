package com.example.administrator.mylistviewdemotwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListFruitAdapter extends ArrayAdapter<FruitDataBean> {
    private int resourd;
    public ListFruitAdapter(Context context, int textViewResourId, List<FruitDataBean> list){
        super(context,textViewResourId,list);
        this.resourd=textViewResourId;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        FruitDataBean fruitDataBean=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view=LayoutInflater.from(getContext()).inflate(R.layout.item_fruit,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.imageView=view.findViewById(R.id.item_img_fruit);
            viewHolder.textView=view.findViewById(R.id.item_name_fruit);
            view.setTag(viewHolder);//将viewHolder储存在view中
        }else {
            view = convertView;
            viewHolder=(ViewHolder)view.getTag();//将viewHolder取出来
        }
        viewHolder.imageView.setImageResource(fruitDataBean.getImage());
        viewHolder.textView.setText(fruitDataBean.getName());
        return view;
    }
    public  class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
