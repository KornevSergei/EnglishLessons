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

    ArrayList<LessonItem> lessonItems;
    //делаем контекст для адаптера что бы можно было передавать по клику урока
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
    public void onBindViewHolder(@NonNull LessonViewHolder holder, int position) {
        LessonItem lessonItem = lessonItems.get(position);

        holder.lessonImageView.setImageResource(lessonItem.getImageResource());
        holder.lessonTitleTextView.setText(lessonItem.getTitle());

    }

    @Override
    public int getItemCount() {
        return lessonItems.size();
    }




    //связываем поля с разметкой и даём возможность клика
    class LessonViewHolder extends RecyclerView.ViewHolder implements AdapterView.OnClickListener {

        public ImageView lessonImageView;
        public TextView lessonTitleTextView;

        public LessonViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            lessonImageView = itemView.findViewById(R.id.lessonImageView);
            lessonTitleTextView = itemView.findViewById(R.id.lessonTitleTextView);
        }


        //описываем действие клика на элементы урока
        @Override
        public void onClick(View v) {
            //передаём информацию
            int position = getAdapterPosition();
            LessonItem lessonItem = lessonItems.get(position);

            //запускаем нужную активти узнав позицию
            Intent intent = new Intent(context, LessonDescription.class);
            intent.putExtra("imageResource", lessonItem.getImageResource());
            intent.putExtra("title", lessonItem.getTitle());
            intent.putExtra("description", lessonItem.getDescription());
            context.startActivity(intent);


        }

    }

}
