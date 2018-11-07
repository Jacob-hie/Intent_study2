package com.hie2j.intent_study2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn3;
    private Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式跳转 第一种
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,Activity_a.class);
//                startActivity(intent);
                //显式跳转 第二种
//                Intent intent = new Intent();
//                intent.setClassName(MainActivity.this,
//                        "com.hie2j.intent_study.Activity_a");
//                startActivity(intent);
                //显式跳转 第三种
                Intent intent = new Intent();
                intent.setClassName("com.hie2j.intent_study",
                        "com.hie2j.intent_study.Activity_a");
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.hie2j.intent_study.eating");
                startActivity(intent);
            }
        });
    }
}
