package com.example.englishlessons;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//делаем адаптер для уроков
public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.LessonViewHolder> {


    @NonNull
    @Override
    public LessonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lesson_item,parent,false);
        LessonViewHolder lessonViewHolder = new LessonViewHolder(view);
        return lessonViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull LessonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class LessonViewHolder extends RecyclerView.ViewHolder{

        public ImageView lessonImageView;
        public TextView titleTextView;

        public LessonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
