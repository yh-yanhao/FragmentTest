package com.bwie.test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class F1 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=View.inflate(getActivity(),R.layout.f1,null);
        Log.i("A------","onCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("A------","onActivityCreated");
        TextView tv= (TextView) getView().findViewById(R.id.one);
        Bundle bundle=getArguments();
//       String str =bundle.getString("zhi");
        tv.setText(bundle.getString("zhi"));
//        Toast.makeText(getActivity(),str,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("A------","onAttach");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("A------","onDetach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("A------","onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("A------","onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("A------","onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("A------","onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("A------","onResume");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("A------","onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("A------","onDestroyView");
    }
}
