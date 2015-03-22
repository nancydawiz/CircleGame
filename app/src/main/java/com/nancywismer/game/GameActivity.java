package com.nancywismer.game;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;


public class GameActivity extends ActionBarActivity {

    private int mScore = 0;
    private View mTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Animation that makes the bubbles go up
        final Animation up = new TranslateAnimation(0,0,0,-1050);
        up.setDuration(2000);
        up.setRepeatCount(-1);

        final View circle = findViewById(R.id.circle);
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle.setVisibility(View.INVISIBLE);
            }
        });
        circle.setAnimation(up);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
