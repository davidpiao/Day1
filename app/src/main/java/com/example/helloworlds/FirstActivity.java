package com.example.helloworlds;
//음료주문 activity

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button b1, b2, b3;
    EditText e1, e2;
    TextView tv1;

    private final static int REQUEST_CODE_1 = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        b1 = findViewById(R.id.btnCall);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                callSecondActivity();
            }
        });

        b2 = findViewById(R.id.btnMsg);
        e1 = findViewById(R.id.etMsg);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callSecondActivityWithMsg();
            }
        });

        b3 = findViewById(R.id.btnMsg3);
        e2 = findViewById(R.id.etMsg3);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callSecondActivityWithMsg3();
            }
        });
    }

    private void callSecondActivityWithMsg3() {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("msg", e2.getText().toString());
        startActivityForResult(intent, REQUEST_CODE_1);
    }

    private void callSecondActivityWithMsg() {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("msg", e1.getText().toString());
        startActivity(intent);
    }

    private void callSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000){
            if(requestCode == RESULT_OK){
                String msg = data.getStringExtra("msg");
                tv1.setText(msg);
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
