package com.example.idan.menu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.m) {
            layout.setBackgroundColor(Color.BLACK);
        }
        if (id == R.id.m1) {
            layout.setBackgroundColor(Color.BLUE);
        }
        if (id == R.id.m2) {
            layout.setBackgroundColor(Color.GREEN);
        }
        if (id == R.id.m3) {
            layout.setBackgroundColor(Color.WHITE);
        }
        return  super.onOptionsItemSelected(item);
    }

    public void click(View view) {
        Intent t=new Intent(this,Main2Activity.class);

        startActivity(t);

    }}
