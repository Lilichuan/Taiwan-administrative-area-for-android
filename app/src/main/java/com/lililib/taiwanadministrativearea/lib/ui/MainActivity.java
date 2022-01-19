package com.lililib.taiwanadministrativearea.lib.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lililib.taiwanadministrativearea.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SelectAreaFragment fragment = SelectAreaFragment.newInstance(true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
}