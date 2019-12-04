package com.example.tictacdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int player = 0;
    private int[] gamesState = {-1,-1,-1,-1,-1,-1,-1,-1,-1};

    public void dropImage(View v) {
        ImageView imageView = (ImageView) v;
        int state = Integer.valueOf(imageView.getTag().toString());
        if (gamesState[state] == -1) {
            gamesState[state] = player;

            imageView.setTranslationY(-1500);

            if (player == 0) {
                imageView.setImageResource(R.drawable.yellow);
                player = 1;
            } else {
                imageView.setImageResource(R.drawable.red);
                player = 0;
            }
            imageView.animate().translationYBy(1500).setDuration(300);
            System.out.println("another commit");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
