package com.example.backgrounddemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.backgrounddemoapp.tasks.DownloadImageTask;
import com.example.backgrounddemoapp.tasks.MyIntentService;

public class MainActivity extends AppCompatActivity {
    DownloadImageTask imageTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageTask = new DownloadImageTask(new ImageView(this));
        imageTask.execute("url", "url2", "url3");
        startService(new Intent(this, MyIntentService.class));
        stopService(new Intent(this, MyIntentService.class));
    }
}
