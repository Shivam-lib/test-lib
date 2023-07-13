package com.brothers.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.brothers.test_lib.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorld.printLog("Shivam-lib", "Hello world");
    }
}