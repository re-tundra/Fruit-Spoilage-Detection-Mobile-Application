package com.fruitalert;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GuidelineActivity extends AppCompatActivity {

    Button next;
    TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);
        Log.d("All Log", ("Guideline activity"));
        next = findViewById(R.id.button3);
        skip = findViewById(R.id.skip);
        next.setOnClickListener(this::goToGuideline2);
        skip.setOnClickListener(this::skip);

    }

    private void goToGuideline2(View view){
        Intent intent = new Intent(this, GuidelineActivity2.class);
        view.getContext().startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void skip(View view){
        Intent intent = new Intent(this, MainActivity.class);
        view.getContext().startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}