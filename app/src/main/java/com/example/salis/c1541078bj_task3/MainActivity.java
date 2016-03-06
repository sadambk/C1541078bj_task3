package com.example.salis.c1541078bj_task3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int counter = 0;
    TextView scoreText;
    EditText UserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        UserName = (EditText)findViewById(R.id.editText);
        scoreText = (TextView)findViewById(R.id.textView4);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Letter_Counting) {

            Intent LCount = new Intent(this, Main2Activity.class);
            LCount.putExtra("Username", UserName.getText().toString());
            startActivityForResult(LCount, 1);


        }

        return super.onOptionsItemSelected(item);
    }
   public void onActivityResult(int requestCode, int resultCode, Intent data){




        if(requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {

                ++counter;
                scoreText.setText(String.valueOf(counter));
            } else {
                Toast.makeText(getApplicationContext(), "No Score to record!", Toast.LENGTH_LONG).show();
            }
        }


        }



    }

