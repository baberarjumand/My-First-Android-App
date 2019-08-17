package com.baberarjumand.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String lastPath = this.getIntent().getData().getLastPathSegment();
        if(lastPath == null)
            throw new NullPointerException();
//
//        if(lastPath.equals("view")) {
//            String monsterId = this.getIntent().getData().getQueryParameter("id");
//        }

        int monsterId = this.getIntent().getExtras().getInt("monsterId");

        ImageView monsterImage = findViewById(R.id.monsterImage);
        monsterImage.setImageResource(monsterId);

    }
}
