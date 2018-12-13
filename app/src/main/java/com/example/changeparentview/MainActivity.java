package com.example.changeparentview;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends Activity {
    ScrollView scrollView;
    LinearLayout linearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ScrollView scrollView = new ScrollView(this);
        LinearLayout base_layout = (LinearLayout)findViewById(R.id.base_layout);


        ViewGroup parent = (ViewGroup)base_layout.getParent();

        //親との関係を切る必要がある
        if(parent != null) {
            parent.removeView(base_layout);
        }

        //親を再定義
        parent.addView(scrollView);
        scrollView.addView(base_layout);

    }
}