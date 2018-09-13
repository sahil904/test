package com.example.sahil.sfdghrj;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    public ListAdapter(ArrayList<Pogo> list, Context context) {
        this.list = list;
        this.context = context;
    }

    ArrayList<Pogo> list;
    Context context;
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

        Pogo pogo=list.get(position);
        holder.image.setImageDrawable(context.getResources().getDrawable(pogo.getImage()));
        holder.html.setText(pogo.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListViewHolder extends  RecyclerView.ViewHolder {
        ImageView image;
        TextView html, css, rating, commnet, price, actual;

        public ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            html = itemView.findViewById(R.id.html);
        }
    }
}
