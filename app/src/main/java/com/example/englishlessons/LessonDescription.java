package com.example.englishlessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LessonDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_decription);


        TextView title = findViewById(R.id.titleTextView);
        TextView description = findViewById(R.id.descriptionTextView);


        //апускаем активти по клику на урок и устанавливаем текст
        Intent intent = getIntent();
        if (intent != null){
            title.setText(intent.getStringExtra("title"));
            description.setText(intent.getStringExtra("description"));

        }
    }
}