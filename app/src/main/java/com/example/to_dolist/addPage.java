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

        EditText text = findViewById(R.id.taskName);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            int value = extras.getInt("key");
            text.setText(MainActivity.list.getName(value));
        }
    }

    public void addTask(View view) {
        EditText text = findViewById(R.id.taskName);
        if(text.getText().toString().equals("")){
            Snackbar notice = Snackbar.make(view, "Empty", 1000);
            notice.show();
        }else{
            MainActivity.list.add(text.getText().toString());
            startActivity(new Intent(this, MainActivity.class));
        }
    }

    public void backHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void delete(View view) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int value = extras.getInt("key");
            MainActivity.list.remove(value);
        }
        startActivity(new Intent(this, MainActivity.class));
    }
}