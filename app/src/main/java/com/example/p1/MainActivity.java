package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "MainActivity";
    Button button;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("username",username.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"onDestroy");
    }
}
