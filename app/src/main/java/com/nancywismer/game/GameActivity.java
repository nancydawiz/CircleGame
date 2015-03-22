package com.nancywismer.game;

import android.opengl.Visibility;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import java.util.Random;


public class GameActivity extends ActionBarActivity {

    private int mScore = 0;
    Animation up;
    View[] cir = new View[15];
    private int [] winners = new int[5];
    private int loser;

   /* View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cir[0].setBackgroundColor(0xff0000);
            cir[12].setBackgroundColor(0xffff00);
        }
    };*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Random random = new Random();
        loser = random.nextInt();
        do
            winners[0] = random.nextInt(14);
        while (winners[0] == loser);

        for(int i = 1; i < 13; i ++){
            winners[i] = random.nextInt(14);
            while (winners[i] == winners[i-1] || winners[i] == loser){
                winners[i] = random.nextInt();
            }
        }


        cir[0] = findViewById(R.id.circle1);
        cir[1] = findViewById(R.id.circle2);
        cir[2] = findViewById(R.id.circle3);
        cir[3] = findViewById(R.id.circle4);
        cir[4] = findViewById(R.id.circle5);
        cir[5] = findViewById(R.id.circle6);
        cir[6] = findViewById(R.id.circle7);
        cir[7] = findViewById(R.id.circle8);
        cir[8] = findViewById(R.id.circle9);
        cir[9] = findViewById(R.id.circle10);
        cir[10] = findViewById(R.id.circle11);
        cir[11] = findViewById(R.id.circle12);
        cir[12] = findViewById(R.id.circle13);
        cir[13] = findViewById(R.id.circle14);
        cir[14] = findViewById(R.id.circle15);


        for (int i = 0; i < 15; i++) {
            final int finalI = i;
            cir[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == winners[0] || finalI == winners[1] || finalI == winners[2] || finalI == winners[3]) {
                        cir[finalI].setBackgroundColor(0xff0000);
                    }
                }
            });
        }
    }
}


