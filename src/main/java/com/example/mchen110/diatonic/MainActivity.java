package com.example.mchen110.diatonic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.Random;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
    int ans = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play_button = (Button)findViewById(R.id.play_button);
        //Play two notes when play_button is clicked
        play_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v) {
                //Get dropdown menu
                Spinner key_dropdown = (Spinner)findViewById(R.id.key_dropdown);
                //Get user's key choice
                int key = key_dropdown.getSelectedItemPosition();
                int root = -1;
                switch (key) {
                    case 1: root = R.raw.c4;
                        break;
                    case 2: root = R.raw.g4;
                        break;
                    case 3: root = R.raw.d4;
                        break;
                    case 4: root = R.raw.a4;
                        break;
                    case 5: root = R.raw.e4;
                        break;
                    case 6: root = R.raw.b4;
                        break;
                    case 7: root = R.raw.gb4;
                        break;
                    case 8: root = R.raw.db4;
                        break;
                    case 9: root = R.raw.ab4;
                        break;
                    case 10: root = R.raw.eb4;
                        break;
                    case 11: root = R.raw.bb4;
                        break;
                    //Change this
                    case 12: root = R.raw.f4;
                        break;
                }
                //Create media player and start audio
                MediaPlayer mp1 = MediaPlayer.create(MainActivity.this, root);
                mp1.start();
                //Create condition to stop playback
                mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
                {
                    @Override
                    public void onCompletion(MediaPlayer mp)
                    {
                        Random rand = new Random();
                        int random_num = rand.nextInt(8) + 1;
                        ans = random_num;
                        int note = -1;
                        //Get user's key choice
                        int key = ((Spinner)findViewById(R.id.key_dropdown)).getSelectedItemPosition();
                        switch (key) {
                            case 1:
                                switch (random_num) {
                                    case 1: note = R.raw.c4;
                                        break;
                                    case 2: note = R.raw.d4;
                                        break;
                                    case 3: note = R.raw.e4;
                                        break;
                                    case 4: note = R.raw.f4;
                                        break;
                                    case 5: note = R.raw.g4;
                                        break;
                                    case 6: note = R.raw.a4;
                                        break;
                                    case 7: note = R.raw.b4;
                                        break;
                                }
                                break;
                            case 2:
                                switch (random_num) {
                                    case 1: note = R.raw.g4;
                                        break;
                                    case 2: note = R.raw.a4;
                                        break;
                                    case 3: note = R.raw.b4;
                                        break;
                                    case 4: note = R.raw.c4;
                                        break;
                                    case 5: note = R.raw.d4;
                                        break;
                                    case 6: note = R.raw.e4;
                                        break;
                                    case 7: note = R.raw.gb4;
                                        break;
                                }
                                break;
                            case 3:
                                switch (random_num) {
                                    case 1: note = R.raw.d4;
                                        break;
                                    case 2: note = R.raw.e4;
                                        break;
                                    case 3: note = R.raw.gb4;
                                        break;
                                    case 4: note = R.raw.g4;
                                        break;
                                    case 5: note = R.raw.a4;
                                        break;
                                    case 6: note = R.raw.b4;
                                        break;
                                    case 7: note = R.raw.db4;
                                        break;
                                }
                                break;
                            case 4:
                                switch (random_num) {
                                    case 1: note = R.raw.a4;
                                        break;
                                    case 2: note = R.raw.b4;
                                        break;
                                    case 3: note = R.raw.db4;
                                        break;
                                    case 4: note = R.raw.d4;
                                        break;
                                    case 5: note = R.raw.e4;
                                        break;
                                    case 6: note = R.raw.gb4;
                                        break;
                                    case 7: note = R.raw.ab4;
                                        break;
                                }
                                break;
                            case 5:
                                switch (random_num) {
                                    case 1: note = R.raw.e4;
                                        break;
                                    case 2: note = R.raw.gb4;
                                        break;
                                    case 3: note = R.raw.ab4;
                                        break;
                                    case 4: note = R.raw.a4;
                                        break;
                                    case 5: note = R.raw.b4;
                                        break;
                                    case 6: note = R.raw.db4;
                                        break;
                                    case 7: note = R.raw.eb4;
                                        break;
                                }
                                break;
                            case 6:
                                switch (random_num) {
                                    case 1: note = R.raw.b4;
                                        break;
                                    case 2: note = R.raw.db4;
                                        break;
                                    case 3: note = R.raw.eb4;
                                        break;
                                    case 4: note = R.raw.e4;
                                        break;
                                    case 5: note = R.raw.gb4;
                                        break;
                                    case 6: note = R.raw.ab4;
                                        break;
                                    case 7: note = R.raw.bb4;
                                        break;
                                }
                                break;
                            case 7:
                                switch (random_num) {
                                    case 1: note = R.raw.gb4;
                                        break;
                                    case 2: note = R.raw.ab4;
                                        break;
                                    case 3: note = R.raw.bb4;
                                        break;
                                    case 4: note = R.raw.b4;
                                        break;
                                    case 5: note = R.raw.db4;
                                        break;
                                    case 6: note = R.raw.eb4;
                                        break;
                                    case 7: note = R.raw.f4;
                                        break;
                                }
                                break;
                            case 8:
                                switch (random_num) {
                                    case 1: note = R.raw.db4;
                                        break;
                                    case 2: note = R.raw.eb4;
                                        break;
                                    case 3: note = R.raw.f4;
                                        break;
                                    case 4: note = R.raw.gb4;
                                        break;
                                    case 5: note = R.raw.ab4;
                                        break;
                                    case 6: note = R.raw.bb4;
                                        break;
                                    case 7: note = R.raw.c4;
                                        break;
                                }
                                break;
                            case 9:
                                switch (random_num) {
                                    case 1: note = R.raw.ab4;
                                        break;
                                    case 2: note = R.raw.bb4;
                                        break;
                                    case 3: note = R.raw.c4;
                                        break;
                                    case 4: note = R.raw.db4;
                                        break;
                                    case 5: note = R.raw.eb4;
                                        break;
                                    case 6: note = R.raw.f4;
                                        break;
                                    case 7: note = R.raw.g4;
                                        break;
                                }
                                break;
                            case 10:
                                switch (random_num) {
                                    case 1: note = R.raw.eb4;
                                        break;
                                    case 2: note = R.raw.f4;
                                        break;
                                    case 3: note = R.raw.g4;
                                        break;
                                    case 4: note = R.raw.ab4;
                                        break;
                                    case 5: note = R.raw.bb4;
                                        break;
                                    case 6: note = R.raw.c4;
                                        break;
                                    case 7: note = R.raw.d4;
                                        break;
                                }
                                break;
                            case 11:
                                switch (random_num) {
                                    case 1: note = R.raw.bb4;
                                        break;
                                    case 2: note = R.raw.c4;
                                        break;
                                    case 3: note = R.raw.d4;
                                        break;
                                    case 4: note = R.raw.eb4;
                                        break;
                                    case 5: note = R.raw.f4;
                                        break;
                                    case 6: note = R.raw.g4;
                                        break;
                                    case 7: note = R.raw.a4;
                                        break;
                                }
                                break;
                            case 12:
                                switch (random_num) {
                                    case 1: note = R.raw.f4;
                                        break;
                                    case 2: note = R.raw.g4;
                                        break;
                                    case 3: note = R.raw.a4;
                                        break;
                                    case 4: note = R.raw.bb4;
                                        break;
                                    case 5: note = R.raw.c4;
                                        break;
                                    case 6: note = R.raw.d4;
                                        break;
                                    case 7: note = R.raw.e4;
                                        break;
                                }
                                break;
                        }
                        MediaPlayer mp2 = MediaPlayer.create(MainActivity.this, note);
                        mp2.start();
                    }
                });
            }
        });

        Button submit_button = (Button)findViewById(R.id.submit_button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner guess = (Spinner)findViewById(R.id.guess);
                TextView reveal = (TextView)findViewById(R.id.answer);
                if ((guess.getSelectedItemPosition() + 1) == ans) {
                    reveal.setText("Correct!");
                    reveal.setVisibility(VISIBLE);
                }
                else {
                    reveal.setText("Incorrect, try again.");
                    reveal.setVisibility(VISIBLE);
                }
            }
        });

    }
}
