package com.example.downloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadPic extends AsyncTask {
    InputStream a;
    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            URL url = new URL("https://daks2k3a4ib2z.cloudfront.net/56cf5dcdd3b4fc4579d08bef/56cf5dced3b4fc4579d08bf8_BomberMario-icon-300x300.jpg");
            a=(InputStream) url.getContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        Bitmap bitmap= Bitmap.createBitmap(BitmapFactory.decodeStream(a));
        MainActivity.doImg(bitmap);
    }
}
