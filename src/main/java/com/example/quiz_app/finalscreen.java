package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class finalscreen extends AppCompatActivity {

    TextView score_text;
    String name;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalscreen);
        score_text = findViewById(R.id.textView6);
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        score = intent.getIntExtra("score", score);

        Integer i = new Integer(score);

        score_text.setText(i.toString() + "/5");
    }

    public void finish_quiz(View view) {
        finish();
        System.exit(0);
    }

    public void new_quiz(View view) {
        Intent intent = new Intent(this, main_after_final.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}