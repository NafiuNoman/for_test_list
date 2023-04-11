package com.example.editlistnew;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    List<StudentModel> list;
    Context ctx;


    RecyclerAdapter(Context ctx, List<StudentModel> list){
        this.ctx= ctx;
        this.list=list;

    }
    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_row,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {

        holder.name.setText(list.get(position).getName());
        holder.fName.setText(list.get(position).getFname());
        holder.mName.setText(list.get(position).getMname());
        holder.id.setText(list.get(position).getId());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name,fName,mName,id;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            name = itemView.findViewById(R.id.rowName);
            fName = itemView.findViewById(R.id.rowFName);
            mName = itemView.findViewById(R.id.rowMName);
            id = itemView.findViewById(R.id.rowIdName);


        }
    }
}
