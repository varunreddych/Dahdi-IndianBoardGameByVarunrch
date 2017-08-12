package com.example.varun.dahdi_indianboardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {



    public void changeToGame(View view){


        Intent i=new Intent(getApplicationContext(), Game.class);

        startActivity(i);


    }
    public void changeToInstructions(View view){


        Intent i=new Intent(getApplicationContext(), Instructions.class);

        startActivity(i);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_main);
    }
}
