package com.inveitix.preferencesapplication.ui;

import android.Manifest;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.inveitix.preferencesapplication.R;
import com.inveitix.preferencesapplication.databinding.ActivityMainBinding;
import com.inveitix.preferencesapplication.util.PreferencesUtil;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final int RC_WRITE_EXTERNAL_STORAGE = 10;
    ActivityMainBinding binding;
    PreferencesUtil preferencesUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        preferencesUtil = PreferencesUtil.getInstance(MainActivity.this);
        initListeners();
    }

    private void initListeners() {
        binding.btnSaveName.setOnClickListener(v -> {
            String name = binding.edtName.getText().toString();
            preferencesUtil.saveName(name);
        });

        binding.btnShowSavedName.setOnClickListener(v -> {
//            String name = preferencesUtil.getName();
//
//            if (name.isEmpty()) {
//                binding.txtSavedName.setText("Name does not exist!");
//            } else {
//                binding.txtSavedName.setText(name);
//            }
            if (hasPermissions()){
                getAlbum("My Album");
            }
        });
    }

    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }

    public File getAlbum(String name) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES
        ), name);

        if (!file.mkdirs()){
            Log.e("MainActivity", "Directory does not created!");
        }
        return file;
    }

    private boolean hasPermissions() {

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    RC_WRITE_EXTERNAL_STORAGE);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == RC_WRITE_EXTERNAL_STORAGE) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getAlbum("My Album");
            } else {
                Toast.makeText(this, "Dont have write permission!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
