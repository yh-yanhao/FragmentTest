package com.bwie.test;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView one,two,three;
    private F1 f1;
    private F2 f2;
    private F3 f3;
    private FragmentTransaction begin;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.i("A------","oncreat");
        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);

        //得到Fragment管理者对象
        fragmentManager = getSupportFragmentManager();
        //开启事务
        begin = fragmentManager.beginTransaction();
        //得到Fragment对象
        f1 = new F1();
        Bundle bundle=new Bundle();
        bundle.putString("zhi","这是Activity传向Fragment1的值");
        f1.setArguments(bundle);
        f2 = new F2();
        Bundle bundle1=new Bundle();
        bundle1.putString("zhi1","这是Activity传向Fragment2的值");
        f2.setArguments(bundle1);
        f3 = new F3();
        Bundle bundle2=new Bundle();
        bundle2.putString("zhi2","这是Activity传向Fragment3的值");
        f3.setArguments(bundle2);
        //添加Fragment页
        // 同时添加4个fragment
        begin.add(R.id.fl,f1).add(R.id.fl,f2).add(R.id.fl,f3);
        begin.show(f1);
        begin.hide(f2);
        begin.hide(f3);
        // 提交事务
        begin.commit();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                // 开启事务,得到事务对象
                FragmentTransaction begin = fragmentManager
                        .beginTransaction();

                begin.show(f1);
                begin.hide(f2);
                begin.hide(f3);
                // 提交事务
                begin.commit();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                // 开启事务,得到事务对象
                FragmentTransaction begin = fragmentManager
                        .beginTransaction();
                begin.show(f2);
                begin.hide(f1);
                begin.hide(f3);
                // 提交事务
                begin.commit();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT).show();
                // 开启事务,得到事务对象
                FragmentTransaction begin = fragmentManager
                        .beginTransaction();
                begin.show(f3);
                begin.hide(f1);
                begin.hide(f2);
                // 提交事务
                begin.commit();
            }
        });
    }
  /*  @Override
    protected void onStart() {
        super.onStart();
        Log.i("A------","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("A------","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("A------","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("A------","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("A------","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("A------","onRestart");
    }*/

}
