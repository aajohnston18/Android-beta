package edu.whitworth.amanda.jortalia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Game_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__menu);

        ImageView back = (ImageView) findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Game_Menu.this, Home.class);
                startActivity(back);
            }
        });

        TextView game = (TextView) findViewById(R.id.Game_List);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game = new Intent(Game_Menu.this, Game2.class);
                startActivity(game);
            }
        });
    }
}
