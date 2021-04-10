package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class main_after_final extends AppCompatActivity {

    TextView enter_name;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_after_final);
        Intent intent = getIntent();
        name= intent.getStringExtra("name");
        enter_name = findViewById(R.id.name_text);
        enter_name.setText(name);
    }

    public void start_quiz(View view) {
        Intent intent = new Intent(this,question1.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}