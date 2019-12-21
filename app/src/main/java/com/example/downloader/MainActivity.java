package com.example.downloader;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static Button btn;
    static ImageView imageview;
    DownloadPic pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview=findViewById(R.id.imageView);
        btn=findViewById(R.id.Button);
        btn.setOnClickListener(this);
    }
    public void onClick(View view) {
        pic=new DownloadPic();
        pic.execute();
    }
    public static void doImg(Bitmap b) {
        btn.setVisibility(View.INVISIBLE);
        imageview.setImageBitmap(b);
    }
}
