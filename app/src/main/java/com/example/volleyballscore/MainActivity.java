package com.example.volleyballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int setTeamA = 0;
    int setTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetForTeamA(int set) {

        TextView setView = (TextView) findViewById(R.id.team_a_set);
        setView.setText(String.valueOf(set));

    }

    public void displaySetForTeamB(int set) {

        TextView setView = (TextView) findViewById(R.id.team_b_set);
        setView.setText(String.valueOf(set));
    }

    public void plusonea(View View) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    public void plusoneb(View View) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void plusoneseta(View View) {

        setTeamA = setTeamA + 1;
        displaySetForTeamA(setTeamA);
    }

    public void plusonesetb(View View) {

        setTeamB = setTeamB + 1;
        displaySetForTeamB(setTeamB);
    }

    public void reset(View View) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        setTeamA = 0;
        setTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displaySetForTeamA(setTeamA);
        displaySetForTeamB(setTeamB);


    }

}