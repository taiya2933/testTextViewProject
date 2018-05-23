package com.example.a025.testtextviewproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.baselibrary.BaseActivity;

import java.lang.reflect.Field;

public class A_Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    @Override
    protected void initView(@Nullable Bundle bundle) {
        Log.e("lk_chen", "result==" + "执行了么------------"+"initView");
    }

    @Override
    protected void initData() {
        Log.e("lk_chen", "result==" + "执行了么------------"+"initData");
    }

    @Override
    protected void initEvent() {
        Log.e("lk_chen", "result==" + "执行了么------------"+"initEvent");
    }

    public void tv_onclick(View view) {
        startActivity(new Intent(this, B_Activity.class));
    }

}
