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
        EditText des = findViewById(R.id.editTextTextPersonName2);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            int value = extras.getInt("key");
            text.setText(MainActivity.list.getName(value));
            des.setText(MainActivity.list.getDescription(value));
        }
    }

    public void addTask(View view) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) update(view, extras);
        else addToList(view);
    }

    public void update(View view, Bundle extras) {
        EditText name = findViewById(R.id.taskName);
        EditText des = findViewById(R.id.editTextTextPersonName2);
        if(name.getText().toString().equals("")){
            Snackbar notice = Snackbar.make(view, "Empty", 1000);
            notice.show();
        }else{
            MainActivity.list.setName(extras.getInt("key"), name.getText().toString());
            MainActivity.list.setDescription(extras.getInt("key"), des.getText().toString());
            startActivity(new Intent(this, MainActivity.class));
        }
    }

    public void addToList(View view) {
        EditText text = findViewById(R.id.taskName);
        EditText textDescription = findViewById(R.id.editTextTextPersonName2);
        if(text.getText().toString().equals("")){
            Snackbar notice = Snackbar.make(view, "Empty", 1000);
            notice.show();
        }else{
            MainActivity.list.add(text.getText().toString(), textDescription.getText().toString());
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