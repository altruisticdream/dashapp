package com.example.dashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {
    private TextView yourTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        button=(Button)findViewById(R.id.buttonappoint) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAppoint();
            }
        });

    }

    public void openActivityAppoint()
    {
        Intent intent=new Intent(secondactivity.this,appointment.class);
        startActivity(intent);
    }
}
