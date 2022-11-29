package com.example.fetchinglocationlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.locationhelper.LocationHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationHelper.getDistanceInKM(0, 0, 0, 0);
    }
}