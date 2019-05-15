package com.example.deletelist;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolder> {
    public Context context;
    public List<DataModel> workerInfoData;

    public recyclerAdapter(Context context, List<DataModel> workerInfoData) {
        this.context = context;
        this.workerInfoData = workerInfoData;
    }

    @NonNull
    @Override
    public recyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_row, viewGroup, false);
        return new recyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        if (workerInfoData.get(i).getDelete()) {
            viewHolder.image.setVisibility(View.VISIBLE);

        } else {
            viewHolder.image.setVisibility(View.GONE);

        }

        viewHolder.name.setText(workerInfoData.get(i).getName());

    }


    @Override
    public int getItemCount() {
        return workerInfoData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.deleteImage);
            name = itemView.findViewById(R.id.tv_title);
        }


    }
}