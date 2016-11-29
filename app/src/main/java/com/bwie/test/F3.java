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
public class F3 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(),R.layout.f3,null);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView three= (TextView) getView().findViewById(R.id.three);
//        Bundle bundle=getArguments();
//        three.setText(bundle.getString("zhi2"));

        Bean bean=F2.getBean();
        three.setText(bean.getName());

    }
}
