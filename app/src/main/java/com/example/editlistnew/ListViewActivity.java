package com.example.editlistnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<StudentModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        recyclerView = findViewById(R.id.Recycler);


        list = (List<StudentModel>) getIntent().getSerializableExtra("list");

        recyclerAdapter  = new RecyclerAdapter(this,list);

        recyclerView.setAdapter(recyclerAdapter);




    }
}