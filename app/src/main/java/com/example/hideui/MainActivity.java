package com.example.hideui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    public void show(View view){

        textView.setVisibility(view.VISIBLE);

    }

    public void hide(View view){
        textView.setVisibility(view.INVISIBLE);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView = findViewById(R.id.textViewThang);
    }
}