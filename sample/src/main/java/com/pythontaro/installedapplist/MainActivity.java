/*
Title: InstalledAppList Library's Test Sample
Author: Kazuma Naka
Date: August 23, 2020
Code Version: 1.0.0
Availability: https://github.com/KazumaProject/InstalledAppList.git
 */

package com.pythontaro.installedapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_Config();
    }

    private void recyclerView_Config(){
        RecyclerView recyclerView = findViewById(R.id.test_recyclerView);
        Adapter adapter = new Adapter(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}