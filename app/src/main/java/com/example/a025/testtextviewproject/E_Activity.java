package com.example.a025.testtextviewproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class E_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);
    }

    public void tv_onclick(View view) {
        startActivity(new Intent(this, F_Activity.class));
    }

}
