package com.example.win7.exintent02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        Button btnHome=(Button)findViewById(R.id.btnHome);

        btnHome.setOnClickListener(btnHomeListener);
    }

    Button.OnClickListener btnHomeListener = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Intent intent = new Intent();
            intent.setClass(Second.this,MainActivity.class);
            startActivity(intent);
        }
    };
}
