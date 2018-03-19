package com.example.dminh.fragmentcommunicate.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dminh.fragmentcommunicate.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {


    public FragmentB() {
        // Required empty public constructor
    }

    public static FragmentB newInstance(int col) {
        FragmentB fb = new FragmentB();
        Bundle args = new Bundle();
        args.putInt("Colour",col);
        fb.setArguments(args);
        return fb;
    }

    @Override
    public View onCreateView(LayoutInflater inf, ViewGroup pa,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inf.inflate(R.layout.fragment_b, pa, false);
        Bundle args = getArguments();
        int color = args.getInt("Colour");
        contentView.findViewById(R.id.col).setBackgroundColor(color);
        return contentView;
    }

}
