package com.example.dminh.fragmentcommunicate.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dminh.fragmentcommunicate.Fragments.FragmentA;
import com.example.dminh.fragmentcommunicate.R;

/**
 * Created by dminh on 12/6/2017.
 */

public class ColorAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return FragmentA.COL_NAMES.length;
    }

    @Override
    public Object getItem(int position) {
        return FragmentA.COLOURS[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.simple_list_item1,parent,false);
        }
        TextView text = (TextView) convertView.findViewById(R.id.mau);
        text.setText(FragmentA.COL_NAMES[position]);
        text.setTextColor(FragmentA.COLOURS[position]);
        return convertView;
    }
}
