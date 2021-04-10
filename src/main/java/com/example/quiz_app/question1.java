package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class question1 extends AppCompatActivity {

    String name;
    int score;
    Button answer1;
    Button answer2;
    Button answer3;
    Button submit_btn;
    ProgressBar pb;
    int ques_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        TextView username1 = findViewById(R.id.username1);
        Intent intent = getIntent();
        name= intent.getStringExtra("name");
        username1.setText("Hello " + name + "!");
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        submit_btn = findViewById(R.id.button7);
        ques_num = 1;
        pb = (ProgressBar) findViewById(R.id.progressBar);
        pb.setProgress(ques_num * 20);
    }

    public void submit1(View view) throws InterruptedException {
        Intent intent = new Intent(this, question2.class);
        intent.putExtra("name", name);
        intent.putExtra("score", score);
        startActivity(intent);
    }

    public void answer1(View view) {
        submit_btn.setText("Next");
        answer1.setBackgroundColor(getResources().getColor(R.color.right_green));
        score += 1;
    }

    public void answer2(View view) {
        submit_btn.setText("Next");
        answer1.setBackgroundColor(getResources().getColor(R.color.right_green));
        answer2.setBackgroundColor(getResources().getColor(R.color.wrong_red));
        score += 0;
    }

    public void answer3(View view) {
        submit_btn.setText("Next");
        answer1.setBackgroundColor(getResources().getColor(R.color.right_green));
        answer3.setBackgroundColor(getResources().getColor(R.color.wrong_red));
        score += 0;
    }
}