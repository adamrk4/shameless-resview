package com.example.shamless_resview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    ArrayList<DataModel> dataset;
    public CustomAdapter(ArrayList<DataModel> dataSet) {
        this.dataset=dataSet;
    }
    public  static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textName;
        TextView textDescription;
        ImageView imageView;
        public MyViewHolder(View itemview)
        {
            super(itemview);
            textName=itemview.findViewById(R.id.textView3);
            textDescription=itemview.findViewById((R.id.textView4));
            imageView=itemview.findViewById(R.id.imageView);
        }
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
    holder.textName.setText(dataset.get(position).getName());
    holder.textDescription.setText(dataset.get(position).getDescription());
    holder.imageView.setImageResource(dataset.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

}
