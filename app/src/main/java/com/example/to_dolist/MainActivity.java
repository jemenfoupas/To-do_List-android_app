package com.example.to_dolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    public static List list = new List();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = findViewById(R.id.listLayout);
        for(int i = 0; i < list.getSize(); i++){
            Button btn = new Button(this);
            btn.setWidth(40);
            btn.setHeight(20);
            btn.setText(list.getName(i));
            btn.setTag(i);
            btn.setOnClickListener(v -> {
                Intent nextPage = new Intent(MainActivity.this, addPage.class);
                nextPage.putExtra("key", (Integer) btn.getTag());
                startActivity(nextPage);
            });
            ll.addView(btn);
        }
    }

//    public void onClick(View view) {
//        Intent nextPage = new Intent(this, addPage.class);
//        startActivity(nextPage);
//    }

    public void addToList(View view) {
        Intent nextPage = new Intent(this, addPage.class);
        startActivity(nextPage);
    }
}