package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop() {
        super.onStop();
        // 你好  方便类似部分不是吧
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //hhhh
        //hhhh
        //hhhh
        //hhhh
    }
}
