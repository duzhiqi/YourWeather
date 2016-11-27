package com.dzq.yourweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dzq.yourweather.ui.activity.TestActivity;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @OnClick(R.id.btn)
    public void makeTest(View view){
        Log.e("dzq", "run here");
        startActivity(new Intent(this, TestActivity.class));
    }
}
