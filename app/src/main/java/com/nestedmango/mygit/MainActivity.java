package com.nestedmango.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gitTest(){
        //modified:blue
        String e = "hello";
        Toast.makeText(getApplicationContext(),e, LENGTH_SHORT).show();
    }
}
