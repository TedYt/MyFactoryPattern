package com.ted.myfactorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ted.factorymethodpattern.FactoryMethodPatternTest;
import com.ted.simplefactory.SimpleFactoryTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SimpleFactoryTest.test();
        FactoryMethodPatternTest.test("standard");
    }
}
