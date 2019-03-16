package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Form extends AppCompatActivity {
    EditText name,email;
    Button submit;
    String n,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        name=findViewById(R.id.editText);
        email=findViewById(R.id.emailid);
        submit=findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=name.getText().toString();
                e=email.getText().toString();
                Intent inten= new Intent(Form.this,intent.class);
                inten.putExtra("name",n);
                inten.putExtra("email",e);
                startActivity(inten);
            }
        });

    }
}
