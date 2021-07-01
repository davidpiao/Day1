package com.example.helloworlds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //이건 Main 함수라고 불리면 된다.
        super.onCreate(savedInstanceState);  //부모 부르기
        setContentView(R.layout.layout2); //그 레이아웃 가져오기
    }
}