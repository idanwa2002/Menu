package com.example.idan.menu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Main3Activity extends AppCompatActivity {
    LinearLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        layout1 = (LinearLayout) findViewById(R.id.layout1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0,0,150,"Red");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st=item.getTitle().toString();
        if (st.equals("Red")) {
            layout1.setBackgroundColor(Color.RED);
        }else{
            int id = item.getItemId();


            if (id == R.id.m) {
                layout1.setBackgroundColor(Color.BLACK);
            }
            if (id == R.id.m1) {
                layout1.setBackgroundColor(Color.BLUE);
            }
            if (id == R.id.m2) {
                layout1.setBackgroundColor(Color.GREEN);
            }
            if (id == R.id.m3) {
                layout1.setBackgroundColor(Color.WHITE);
            }}
        return super.onOptionsItemSelected(item);
    }
    public void click1(View view) {
        Intent t1=new Intent(this,MainActivity.class);

        startActivity(t1);

    }}
