package com.example.intentsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends AppCompatActivity {

    private TextView tv_child;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        tv_child = findViewById(R.id.tv_intent_activity);

        Intent starteredIntent = getIntent();

        checked(starteredIntent);


    }

    public void checked(@NonNull Intent intent) {

        if (intent.hasExtra(Intent.EXTRA_TEXT)) {

            String text = intent.getStringExtra(Intent.EXTRA_TEXT);

            tv_child.setText(text);

        }

    }

}
