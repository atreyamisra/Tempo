package com.gameday.core.backend.core;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayersActivity extends AppCompatActivity {

    //TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        //textView = findViewById(R.id.textView);

        Player player = new Player();
        player.getTopTwenty(this);
    }
}