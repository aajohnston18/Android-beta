package edu.whitworth.amanda.jortalia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

                ImageView myImage = (ImageView) findViewById(R.id.Settings);
                myImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent settings = new Intent(Home.this, Settings.class);
                        startActivity(settings);
                    }
                    });

                ImageView account = (ImageView) findViewById(R.id.Account);
                account.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent account = new Intent(Home.this, Account.class);
                        startActivity(account);
                    }
                });

                ImageView friends = (ImageView) findViewById(R.id.Friends);
                friends.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent friends = new Intent(Home.this, Friends.class);
                        startActivity(friends);
                    }
                });

                ImageView play = (ImageView) findViewById(R.id.Play);
                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent play = new Intent(Home.this, Game_Menu.class);
                        startActivity(play);
                    }
                });
                }
}
