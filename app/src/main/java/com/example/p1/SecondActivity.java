package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String msg = getIntent().getExtras().getString("username");

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Hello, " + msg);

        Toast.makeText(this, "Hello, " + msg, Toast.LENGTH_SHORT).show();

    }
}
