package com.example.editlistnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    EditText myName, fatherName, motherName, idNo;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = findViewById(R.id.idMyName);
        fatherName = findViewById(R.id.idFatherName);
        motherName = findViewById(R.id.idMotherName);
        idNo = findViewById(R.id.idIdNo);
        btn = findViewById(R.id.idBtn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StudentModel model = getFormData();
                goToListActivitiy(model);
            }
        });


    }


    private StudentModel getFormData() {


        StudentModel studentModel = new StudentModel(
                myName.getText().toString(),
                fatherName.getText().toString(),
                motherName.getText().toString(),
                idNo.getText().toString());
        return studentModel;
    }

    private void goToListActivitiy(StudentModel model) {
        Intent intent = new Intent(this, ListViewActivity.class);


        intent.putExtra("model", model);

        startActivity(intent);

    }
}