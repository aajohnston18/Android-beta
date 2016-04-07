package edu.whitworth.amanda.jortalia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        ImageView games = (ImageView) findViewById(R.id.Back);
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent games = new Intent(Game2.this, Game_Menu.class);
                startActivity(games);
            }
        });

        ImageView deck = (ImageView) findViewById(R.id.New_Card);
        deck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deck = new Intent(Game2.DISPLAY_SERVICE);
                startActivity(deck);
            }
        });
    }
}
