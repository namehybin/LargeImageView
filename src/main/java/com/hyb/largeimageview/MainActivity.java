package com.hyb.largeimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private LargeImageView largeImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        largeImageView= (LargeImageView) findViewById(R.id.large_image_view);
        try
        {
            InputStream inputStream = getAssets().open("big_image.jpg");
            largeImageView.setInputStream(inputStream);

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
