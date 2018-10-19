package com.example.idan.menu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    LinearLayout layout1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bg1 = (LinearLayout) findViewById(R.id.bg1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0,0,150,"red");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st=item.getTitle().toString();
        if (st.equals("red")) {
            bg1.setBackgroundColor(Color.RED);
        }else{
            int id = item.getItemId();


            if (id == R.id.menui) {
                bg1.setBackgroundColor(Color.BLACK);
            }
            if (id == R.id.menui1) {
                bg1.setBackgroundColor(Color.BLUE);
            }
            if (id == R.id.menui2) {
                bg1.setBackgroundColor(Color.YELLOW);
            }}
        return super.onOptionsItemSelected(item);
    }
    public void go1(View view) {
        Intent t1=new Intent(this,MainActivity.class);

        startActivity(t1);

    }}
