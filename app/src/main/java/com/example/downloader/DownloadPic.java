package com.example.downloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadPic extends AsyncTask {
    Bitmap bitmap;
    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            URL url = new URL("https://www.meme-arsenal.com/memes/27143b2cb7241aa1a6c22a8e31663d07.jpg");
            bitmap= Bitmap.createBitmap(BitmapFactory.decodeStream((InputStream) url.getContent()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        MainActivity.doImg(bitmap);
    }
}
