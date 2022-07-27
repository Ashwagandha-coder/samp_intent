package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textEntry;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        textEntry = findViewById(R.id.et_field);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string = textEntry.getText().toString();

                Context context = MainActivity.this;

                Class destinationActivity = ChildActivity.class;

                Intent childActivity = new Intent(context,destinationActivity);
                childActivity.putExtra(Intent.EXTRA_TEXT,string);

                startActivity(childActivity);

            }
        });


    }
}