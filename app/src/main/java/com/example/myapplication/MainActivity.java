package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取名叫tv_hello的文本控件
        TextView tv_hello = findViewById(R.id.tv_hello);
        //设置TextView控件的文字内容
        tv_hello.setText("今天的天气刚刚好，不冷也不热");
        //设置TextView控件的文字的颜色
        tv_hello.setTextColor(Color.RED);
        //设置TextView控件的文字的大小
        tv_hello.setTextSize(30);


    }
}
