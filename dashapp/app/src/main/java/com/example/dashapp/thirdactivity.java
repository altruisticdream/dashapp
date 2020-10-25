package com.example.dashapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class thirdactivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private TextView yourTextView;
    Button btnsignout;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);

        /*-----------------hooks-------------*/
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        /*-----------------toolbar-------------*/

        setSupportActionBar(toolbar);

        Menu menu=navigationView.getMenu();
        menu.findItem(R.id.nav_logout).setVisible(false);
        menu.findItem(R.id.nav_profile).setVisible(false);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);

        /*-------------------------------------------------ui work for app dashboard*--------------------------------*/
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
    public void onBackPressed()
    {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId())
        {
            case R.id.nav_home:
                break;
            case R.id.nav_login:
                Intent intent=new Intent(thirdactivity.this,appointment.class);
                startActivity(intent);
                break;

            case R.id.nav_share:
                Toast.makeText(this,"share",Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}

