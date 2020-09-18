package com.example.dashapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class fourthactivity extends AppCompatActivity {
    EditText emailid, password;
    Button btnsignup;
    TextView tvsignIn;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);
        mFirebaseAuth = FirebaseAuth.getInstance();
        emailid = findViewById(R.id.emailid);
        password = findViewById(R.id.password);
        btnsignup = findViewById(R.id.signin);
        tvsignIn = findViewById(R.id.textView2);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailid.getText().toString();
                String pwd = password.getText().toString();
                if (email.isEmpty()) {
                    emailid.setError("Please enter email id");
                    emailid.requestFocus();

                } else if (pwd.isEmpty()) {
                    password.setError("Please enter your password");
                    password.requestFocus();
                } else if (email.isEmpty() && pwd.isEmpty()) {
                    Toast.makeText(fourthactivity.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                } else if (!(email.isEmpty() && pwd.isEmpty())) {

                    mFirebaseAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener(fourthactivity.this, new OnCompleteListener<com.google.firebase.auth.AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(fourthactivity.this, "signup unsucessfull,please try again", Toast.LENGTH_SHORT).show();
                            } else {
                                startActivity(new Intent(fourthactivity.this, thirdactivity.class));
                            }

                        }
                    });
                } else {
                    Toast.makeText(fourthactivity.this, "Error Occured!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        tvsignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(fourthactivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}















