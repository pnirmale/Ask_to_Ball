package com.example.ballchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  ask=(Button)findViewById(R.id.askButton);
        final ImageView balldisplay=(ImageView) findViewById(R.id.image_eightBall);
        final int [] ballArray=new int[] {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rng=new Random();
                int number =rng.nextInt(5);
                balldisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
