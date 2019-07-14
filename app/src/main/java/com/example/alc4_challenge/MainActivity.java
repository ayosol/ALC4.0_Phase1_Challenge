package com.example.alc4_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_about_alc;
    Button btn_my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_about_alc = findViewById(R.id.btn_about_alc);
        btn_my_profile = findViewById(R.id.btn_my_profile);
    }

    public void test(View view){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void test2(View view){
        Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
        startActivity(intent);
    }


}
