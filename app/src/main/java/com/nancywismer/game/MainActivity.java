package com.nancywismer.game;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button mStartButton;
    private Button mInstruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartButton = (Button) findViewById(R.id.startButton);
        mInstruction = (Button) findViewById(R.id.instruction);
        mStartButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });

        mInstruction.setOnClickListener(new View.OnClickListener() {
               @Override
            public void onClick(View v) {
                Intent instruct = new Intent(MainActivity.this, Instructions.class);
                startActivity(instruct);
            }
        });


    }

}
