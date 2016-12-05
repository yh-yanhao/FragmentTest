package com.bwie.test.handler;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.bwie.test.R;

public class HandlerActivity extends AppCompatActivity {

    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            int j = msg.what;
            if(j==1){
                Intent intent = new Intent(HandlerActivity.this, ErActivity.class);
                startActivity(intent);
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        new Thread(){
            @Override
            public void run() {
                for(int i=3;i>0;i--){
                    handler.sendEmptyMessage(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }


}
