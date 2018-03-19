package com.example.dminh.fragmentcommunicate.Fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dminh.fragmentcommunicate.Adapters.ColorAdapter;
import com.example.dminh.fragmentcommunicate.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{


    private OnListViewItemClickListener mListener;

    public void onAttach(Context c) {
        super.onAttach(c);
        mListener = (OnListViewItemClickListener) c;
    }
    public FragmentA() {
        // Required empty public constructor
    }

    public static final int[] COLOURS = {
            Color.parseColor("#F44336"),
            Color.parseColor("#FF9800"),
            Color.parseColor("#FFEB3B"),
            Color.parseColor("#4CAF50"),
            Color.parseColor("#2196F3"),
            Color.parseColor("#3F51B5"),
            Color.parseColor("#9C27B0")
    };

    public static final String[] COL_NAMES = {
            "Đỏ",
            "Cam",
            "Vàng",
            "Lục",
            "Lam",
            "Chàm",
            "Tím"
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentview = inflater.inflate(R.layout.fragment_, container, false);

        ListView lv = (ListView)contentview.findViewById(R.id.list);
        lv.setOnItemClickListener(this);
        ColorAdapter colorAdapter = new ColorAdapter();
        lv.setAdapter(colorAdapter);
        return contentview;
    }

    public void onItemClick(AdapterView a, View v, int position, long id){
        mListener.onItemClick(position);
    }
    public interface OnListViewItemClickListener {
        void onItemClick(int position);
    }

}
