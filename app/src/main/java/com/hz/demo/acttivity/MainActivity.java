package com.hz.demo.acttivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hz.demo.R;

public class MainActivity extends AppCompatActivity {

    public static String ID="MAIN_ID";
    public static String NAME="MAIN_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * 在目标页面统一定义param，避免传参页面统一格式
     * @param id
     * @param name
     * @return
     */
    public static Intent open(int id, String name){
        Intent intent=new Intent();
        intent.putExtra(ID,id);
        intent.putExtra(NAME,name);
        return new Intent();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
