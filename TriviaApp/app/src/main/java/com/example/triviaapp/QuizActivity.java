package com.example.triviaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    private QuizBank quiz = new QuizBank();

    private TextView questionView;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;

    private String answer;
    private int score =0;
    private int question=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
}
