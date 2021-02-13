package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int pointsofa=0;
    int pointsofb=0;

    public void threepoints(View view) {
        pointsofa+=3;
        displayForTeamA(pointsofa);
    }

    public void twopoints(View view) {
        pointsofa+=2;
        displayForTeamA(pointsofa);
    }

    public void freethrow(View view) {
        pointsofa+=1;
        displayForTeamA(pointsofa);
    }

    public void complete(View view)
    {
        if(pointsofa>pointsofb)
        {
            Toast toast = Toast.makeText(MainActivity.this,"Team A won the match!!!",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP,0,1300);
            toast.show();
        }
        if(pointsofa<pointsofb)
        {
//            Toast.makeText(this,"Team B won the match!!!",Toast.LENGTH_SHORT).show();
            Toast toast = Toast.makeText(MainActivity.this,"Team B won the match!!!",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP,0,1300);
            toast.show();
        }
        if(pointsofa==pointsofb && pointsofa!=0)
        {
//            Toast.makeText(this,"Match is drawn!!!",Toast.LENGTH_SHORT).show();
            Toast toast = Toast.makeText(MainActivity.this,"Match is drawn!!!",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP,0,1300);
            toast.show();
        }
    }

    public void reset(View view){
        pointsofa=0;
        pointsofb=0;
        displayForTeamA(pointsofa);
        displayForTeamB(pointsofb);
    }

    public void threepointsofb(View view) {
        pointsofb+=3;
        displayForTeamB(pointsofb);
    }

    public void twopointsofb(View view) {
        pointsofb+=2;
        displayForTeamB(pointsofb);
    }

    public void freethrowofb(View view) {
        pointsofb+=1;
        displayForTeamB(pointsofb);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}