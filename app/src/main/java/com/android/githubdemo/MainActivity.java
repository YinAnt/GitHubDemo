package com.android.githubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    Can't finish GitHub sharing process
//    Successfully created project 'GitHubDemo' on GitHub, but initial push failed: unable to access 'https://github.com/YinAnt/GitHubDemo.git/': Could not resolve host: github.com

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
