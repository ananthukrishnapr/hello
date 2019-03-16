package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intent extends AppCompatActivity {
    TextView t1,t2;
    String name1,email1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView3);
        name1=getIntent().getStringExtra("name");
        email1=getIntent().getStringExtra("email");
        t1.setText(name1);
        t2.setText(email1);

    }
}
