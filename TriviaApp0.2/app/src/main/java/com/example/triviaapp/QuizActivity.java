package com.example.triviaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    private QuizBank quiz = new QuizBank();

    private TextView questionView;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;

    private String answer = "James";
    private int score =0;
    private int question=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionView = (TextView)findViewById(R.id.question);
        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);
        choice4 = (Button)findViewById(R.id.choice4);

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice1.getText().equals(answer) )
                {
                    score++;
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    if(question == quiz.getNumOfQuestions())
                    {
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",score);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestion();
                    }
                }
                else
                {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    if(question == quiz.getNumOfQuestions())
                    {
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",score);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestion();
                    }
                }
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice2.getText().equals(answer))
                {
                    score++;
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    if(question == quiz.getNumOfQuestions())
                    {
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",score);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestion();
                    }
                }
                else
                {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    if(question == quiz.getNumOfQuestions())
                    {
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",score);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestion();
                    }
                }
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice3.getText().equals(answer))
                {
                    score++;
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    if(question == quiz.getNumOfQuestions())
                    {
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",score);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestion();
                    }
                }
                else
                {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    if(question == quiz.getNumOfQuestions())
                    {
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",score);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestion();
                    }
                }
            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice4.getText().equals(answer))
                {
                    score++;
                    Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    if(question == quiz.getNumOfQuestions())
                    {
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",score);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestion();

                    }
                }
                else
                {
                    Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    if(question == quiz.getNumOfQuestions())
                    {
                        Intent i = new Intent(QuizActivity.this,ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore",score);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    }
                    else {
                        updateQuestion();
                    }
                }
            }
        });
    }

    private void updateQuestion(){
        questionView.setText(quiz.getQuestion(question));
        choice1.setText(quiz.getChoice1(question));
        choice2.setText(quiz.getChoice2(question));
        choice3.setText(quiz.getChoice3(question));
        choice4.setText(quiz.getChoice4(question));
        answer = quiz.getAnswer(question);
        question++;
    }
}
