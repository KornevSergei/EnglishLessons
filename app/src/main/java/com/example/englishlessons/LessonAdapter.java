package com.example.englishlessons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//делаем адаптер для уроков
public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.LessonViewHolder> {

    ArrayList<LessonItem> lessonItems;
    Context context;

    public LessonAdapter(ArrayList<LessonItem> lessonItems, Context context) {
        this.lessonItems = lessonItems;
        this.context = context;
    }

    @NonNull
    @Override
    public LessonAdapter.LessonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lesson_item, parent, false);

        LessonViewHolder lessonViewHolder = new LessonViewHolder(view);
        return lessonViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LessonAdapter.LessonViewHolder holder, int position) {

        LessonItem lessonItem = lessonItems.get(position);

        holder.lessonImageView.setImageResource(lessonItem.getImageResource());
        holder.lessonTitleTextView.setText(lessonItem.getTitle());
        holder.lessonDescriptionText.setText(lessonItem.getDescription());

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class lessonViewHolder {
    }
}
