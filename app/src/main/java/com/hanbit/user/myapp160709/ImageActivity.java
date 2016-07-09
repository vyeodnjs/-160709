package com.hanbit.user.myapp160709;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageActivity extends Activity implements View.OnClickListener {
    ImageView ivImage;
    Button nextImage, prevImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ivImage = (ImageView) findViewById(R.id.ivImage);
        nextImage = (Button) findViewById(R.id.nextImage);
        prevImage = (Button) findViewById(R.id.prevImage);
        nextImage.setOnClickListener(this);
        prevImage.setOnClickListener(this);
        prevImage.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nextImage :
                ivImage.setImageResource(R.drawable.koala);
                prevImage.setVisibility(View.VISIBLE);
                nextImage.setVisibility(View.INVISIBLE);
                break;
            case R.id.prevImage :
                ivImage.setImageResource(R.drawable.penguins);
                nextImage.setVisibility(View.VISIBLE);
                prevImage.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
