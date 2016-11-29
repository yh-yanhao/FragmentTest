package com.bwie.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class F2 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(),R.layout.f2,null);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView two= (TextView) getView().findViewById(R.id.two);
        Bundle bundle=getArguments();
        two.setText(bundle.getString("zhi1"));


    }


    //静态方法
    public static Bean getBean(){


        Bean bean=new Bean();
        bean.setName("我叫刘小强");
        return bean;
    }
}
