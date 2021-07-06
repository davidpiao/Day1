package com.example.helloworlds;
//toast, count 보여주는 activity
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //이건 Main 함수라고 불리면 된다.
        super.onCreate(savedInstanceState);  //부모 부르기
        setContentView(R.layout.layout2); //그 레이아웃 가져오기

        textView = findViewById(R.id.txtCount);
    }

    public void onToastClick(View view) {
        //display messagebox
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void onCountClick(View view) {
        count++;
        textView.setText(count + "");
    }
}