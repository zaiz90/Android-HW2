package com.example.triviaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView result,finalScore;
    Button startOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView)findViewById(R.id.endText);
        finalScore = (TextView)findViewById(R.id.endScore);
        startOver = (Button)findViewById(R.id.startOver);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        finalScore.setText("Your score is "+score);

        startOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this,QuizActivity.class));
                ResultActivity.this.finish();
            }
        });
    }
}
