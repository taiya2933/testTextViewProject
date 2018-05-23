package com.example.a025.testtextviewproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Student student = new Student();
        student.name = "张三";

        Class aClass = student.getClass();


        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field fiel : declaredFields) {
            String typeName = fiel.getType().getName();
            try {
                if (typeName.contains("String")) {
                    fiel.set(student, "李四");
                } else if (typeName.contains("int")) {
                    fiel.setInt(student, 10);
                } else if (typeName.contains("double")) {
                    fiel.setAccessible(true);
                    fiel.setDouble(student, 15.6);
                }

                Log.e("lk_chen", "result==" + fiel.getName() + "===" + fiel.get(student));
            } catch (Exception e) {

            }

        }

    }

    public void hhh(View view) {
        startActivity(new Intent(this, A_Activity.class));

    }


}
