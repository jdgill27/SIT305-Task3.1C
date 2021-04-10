package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText enter_name;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        name= intent.getStringExtra("name");
        enter_name = findViewById(R.id.enter_name);
        enter_name.setText(name);
    }

    public void start_quiz(View view) {
        Intent intent = new Intent(this,question1.class);
        intent.putExtra("name", enter_name.getText().toString());
        startActivity(intent);
    }
}