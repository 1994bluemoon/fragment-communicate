package com.example.dminh.fragmentcommunicate.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.dminh.fragmentcommunicate.Fragments.FragmentA;
import com.example.dminh.fragmentcommunicate.Fragments.FragmentB;
import com.example.dminh.fragmentcommunicate.R;

public class MainActivity extends AppCompatActivity implements FragmentA.OnListViewItemClickListener{

    final int left = R.id.frag1;
    final int right = R.id.frag2;
    FragmentA mFA;
    FragmentB mFB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFA = new FragmentA();
        getSupportFragmentManager()
                .beginTransaction()
                .add(left, mFA, "FA")
                .commit();
    }

    @Override
    public void onItemClick(int position) {
        int colour = FragmentA.COLOURS[position];


        if (mFB != null) mFB = null;
        mFB = FragmentB.newInstance(colour);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(left, mFB)
                .commit();
    }
}
