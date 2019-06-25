package com.example.backgrounddemoapp.tasks;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.os.AsyncTask;
import android.os.Build;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {

    private ImageView imageView;

    public DownloadImageTask(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected Bitmap doInBackground(String... strings) {
        Bitmap result = downloadImage(strings[0]);
        return result;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        imageView.setImageBitmap(bitmap);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    private Bitmap downloadImage(String url) {

        return Bitmap.createBitmap(new Picture());
    }
}
