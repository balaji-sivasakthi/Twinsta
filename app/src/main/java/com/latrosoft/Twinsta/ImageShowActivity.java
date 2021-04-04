package com.latrosoft.Twinsta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

public class ImageShowActivity extends AppCompatActivity {
    PhotoView photoView;
    String video_url;
    ImageView PlayButtonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_show);
        photoView = findViewById(R.id.photoView);
        PlayButtonImage = findViewById(R.id.PlayButtonImage);


        String url = getIntent().getStringExtra("image_url");
        String content = getIntent().getStringExtra("Content_Type");

        System.out.println("Content================"+content);
        video_url = getIntent().getStringExtra("viedo_url");

        Picasso.get().load(url).into(photoView);
        if (content.equals("GraphImage")) {
            Picasso.get().load(url).into(photoView);
        } else {
            Picasso.get().load(url).into(photoView);
            PlayButtonImage.setVisibility(View.VISIBLE);
            PlayButtonImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(getApplicationContext(), PlayVideoActivity.class);
                    i.putExtra("Video URL",video_url);
                    startActivity(i);
                }
            });
        }


    }
}