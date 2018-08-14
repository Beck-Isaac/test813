package com.example.administrator.myapplication813;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class KaKaoAdapter extends BaseAdapter{

    private ArrayList<Data> userlist;
    private Context context;

    public KaKaoAdapter (ArrayList<Data> userlist, Context context){
        this.userlist = userlist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return userlist.size();
    }

    @Override
    public Object getItem(int i) {
        return userlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return userlist.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        //  View가 있는지 없는지 판단!
        if(view == null) {
            LayoutInflater inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflate.inflate(R.layout.item_view, parent, false);
        }
        TextView titleView = view.findViewById(R.id.itemTitleTextView);
        TextView dataView = view.findViewById(R.id.itemContextTextView);
        titleView.setText(userlist.get(i).getTitle());
        dataView.setText(userlist.get(i).getData());

        return view;
    }
}
