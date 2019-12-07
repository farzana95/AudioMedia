package com.b3company.audiomedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMediaStatus;
    Button startMedia, pauseMedia, stopMedia;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hbd);

        tvMediaStatus = findViewById(R.id.tvMediaStatus);
        startMedia = findViewById(R.id.startMedia);
        pauseMedia = findViewById(R.id.pauseMedia);
        stopMedia = findViewById(R.id.stopMedia);

        startMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMediaStatus.setText("Media is Playing..");
                mediaPlayer.start();
            }
        });

        pauseMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMediaStatus.setText("Media is Pausing..");
                mediaPlayer.pause();
            }
        });

        stopMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMediaStatus.setText("Media is Stoping..");
                mediaPlayer.stop();
            }
        });
    }
}
