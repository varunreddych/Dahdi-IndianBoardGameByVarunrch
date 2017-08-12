package com.example.varun.dahdi_indianboardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Instructions extends AppCompatActivity {


    public void back(View view){

        Intent i=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
    }
}
