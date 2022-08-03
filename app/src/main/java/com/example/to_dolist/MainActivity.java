package com.example.to_dolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public static List list = new List();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        textView.setText("");
        for(int i = 0; i < list.getSize(); i++){
            textView.append( "-"+ list.getString(i)+"\n");
        }
    }

    public void onClick(View view) {
        Intent nextPage = new Intent(this, addPage.class);
        startActivity(nextPage);
    }
}