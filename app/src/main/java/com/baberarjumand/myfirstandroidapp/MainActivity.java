package com.baberarjumand.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);

        ImageButton monster01 = findViewById(R.id.monster01);
        monster01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.viewMonsterImage(R.drawable.monster01);
            }
        });

        ImageButton monster02 = findViewById(R.id.monster02);
        monster02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.viewMonsterImage(R.drawable.monster02);
            }
        });

        ImageButton monster03 = findViewById(R.id.monster03);
        monster03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.viewMonsterImage(R.drawable.monster03);
            }
        });

        ImageButton monster04 = findViewById(R.id.monster04);
        monster04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.viewMonsterImage(R.drawable.monster04);
            }
        });
    }

    private final void viewMonsterImage(int monsterId) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.setAction(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("http://com.baberarjumand.myfirstandroidapp/view?id=" + monsterId);
        intent.setData(uri);
        intent.putExtra("monsterId", monsterId);
        this.startActivity(intent);
    }

}
