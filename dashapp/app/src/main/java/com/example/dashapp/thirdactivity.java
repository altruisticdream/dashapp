package com.example.dashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class thirdactivity extends AppCompatActivity {
    private TextView yourTextView;
    Button btnsignout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        btnsignout=findViewById(R.id.siggnout);
        btnsignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent inttomain=new Intent(thirdactivity.this, MainActivity.class);
                startActivity(inttomain);
            }
        });

        yourTextView = (TextView) findViewById(R.id.textView4);
        yourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();

            }
        });
        yourTextView = (TextView) findViewById(R.id.textView9);
        yourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        yourTextView =(TextView) findViewById(R.id.textView3);
        yourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });
        yourTextView=(TextView)findViewById(R.id.textView6);
        yourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();
            }
        });
        yourTextView=(TextView)findViewById(R.id.textView7);
        yourTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        });
    }
    public void openActivity3()
    {
        Intent intent = new Intent(thirdactivity.this,secondactivity.class);
        startActivity(intent);
    }
    public void openActivity7()
    {
        Intent intent = new Intent(thirdactivity.this,seventhactivity.class);
        startActivity(intent);
    }
    public void openActivity8()
    {
        Intent intent = new Intent(thirdactivity.this,eightactivity.class);
        startActivity(intent);
    }
    public void openActivity9(){
        Intent intent=new Intent(thirdactivity.this,ninthactivity.class);
        startActivity(intent);
    }
    public void openActivity10()
    {
        Intent intent=new Intent(thirdactivity.this,find_doctor.class);
    }
}
