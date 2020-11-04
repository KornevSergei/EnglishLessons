package com.example.englishlessons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;


public class StartActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("tag1");

        tabSpec.setContent(R.id.lessonsTab);
        tabSpec.setIndicator("УРОКИ");
        tabHost.addTab(tabSpec);


        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setContent(R.id.trialsTab);
        tabSpec.setIndicator("ИСПЫТАНИЯ");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag3");
        tabSpec.setContent(R.id.scoreTab);
        tabSpec.setIndicator("МАГАЗИН");
        tabHost.addTab(tabSpec);

        tabHost.setCurrentTab(0);

        //добавляем уроки в список
        ArrayList<LessonItem> lessonItemList = new ArrayList<>();
        lessonItemList.add(new LessonItem(R.drawable.ic_baseline_done_outline_24,Utils.LESSON_1,Utils.DESCRIPTION_1));



//        recyclerView = findViewById(R.id.recyclerView);
//
//        recyclerView.setHasFixedSize(true);
//        adapter = new LessonAdapter(lessonItemList, this);
//
//        layoutManager = new LinearLayoutManager(this);
//
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(layoutManager);

    }
}