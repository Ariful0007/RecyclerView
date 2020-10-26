package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class Adapter extends RecyclerView.Adapter<Adapter.myholder> {
    private String[] data;
    public Adapter(String[] data) {
        this.data=data;
    }

    @NonNull
    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.listview,parent,false);
        return  new  myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myholder holder, int position) {
        String  title=data[position];
        holder.textView.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class   myholder extends ViewHolder {
        ImageView imageView;
        TextView textView;
        public myholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            textView=itemView.findViewById(R.id.name);
        }
    }

}
