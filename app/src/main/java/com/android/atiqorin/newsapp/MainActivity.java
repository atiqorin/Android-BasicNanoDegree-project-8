package com.android.atiqorin.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView stories = (ListView) findViewById(R.id.newsList);
        stories.setAdapter(new NewsAdapter(this));
    }
}
