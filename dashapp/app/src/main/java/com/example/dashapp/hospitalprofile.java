package com.example.dashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hospitalprofile extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitalprofile);

        button=findViewById(R.id.buttontakeappointment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opneactivityhospitalbook();
            }
        });
    }
    public void opneactivityhospitalbook()
    {
        Intent intent=new Intent(hospitalprofile.this,Hospitalbook.class);
        startActivity(intent);
    }
}