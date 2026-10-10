package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button play,settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = newGame(findViewById(R.id.play));
    }
    private void newGame (){
        Intent intent = new Intent(MainActivity.this,GameActivity.class);
        startActivity(intent);

    }
    private void Settings(){
        Intent intent = new Intent(MainActivity.this,SettingsActivity.class);
        startActivity(intent);

    }

}