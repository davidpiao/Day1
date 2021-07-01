package com.example.helloworlds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //on create 자동으로 불림.
    //이건 Main 함수라고 불리면 된다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //부모 부르기
        setContentView(R.layout.activity_main); //그 레이아웃 가져오기
    }
}