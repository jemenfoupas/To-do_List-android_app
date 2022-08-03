package com.example.to_dolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public static int count = 0;
    public static String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(str + " " + count);
        System.out.println(count);



    }

    public void onClick(View view) {
        Snackbar mySnackbar = Snackbar.make(view, "getting started", 5);
        mySnackbar.show();
        System.out.println("click");

        Intent nextPage = new Intent(this, addPage.class);
        startActivity(nextPage);
    }
}