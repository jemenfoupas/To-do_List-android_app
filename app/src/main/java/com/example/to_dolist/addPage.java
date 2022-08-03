package com.example.to_dolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class addPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_page);
        MainActivity.count++;
        System.out.println("new2");
    }

    public void addTask(View view) {
        EditText text = (EditText)findViewById(R.id.taskName);
        MainActivity.str = text.getText().toString();
        Intent nextPage = new Intent(this, MainActivity.class);
        startActivity(nextPage);
    }
}