package com.hz.demo.acttivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hz.demo.R;
import com.hz.demo.widget.MyListView;

public class MainActivity extends AppCompatActivity {

    private MyListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
