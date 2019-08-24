package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointA = 0;
    int pointB = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayA(int number) {
        TextView displyPoint = (TextView) findViewById(R.id.point1_textView);
        displyPoint.setText("" + number);
    }

    public void addthreeA(View view) {

        pointA = pointA + 3;
        displayA(pointA);
    }

    public void addTwoA(View view) {
        pointA = pointA + 2;
        displayA(pointA);
    }

    public void freeThrowA(View view) {
        pointA = pointA + 1;
        displayA(pointA);
    }
    //methods for the next Team

    public void displayB(int number) {
        TextView displyPoint = (TextView) findViewById(R.id.point_textViewB);
        displyPoint.setText("" + number);
    }

    public void addthreeB(View view) {
        pointB = pointB + 3;
        displayB(pointB);
    }

    public void addTwoB(View view) {
        pointB = pointB + 2;
        displayB(pointB);
    }

    public void freeThrowB(View view) {
        pointB = pointB + 1;
        displayB(pointB);

    }
public void reseTbutton (View view){

        pointA =0;
        pointB =0;
    displayA(pointA);
    displayB(pointB);
}

}
