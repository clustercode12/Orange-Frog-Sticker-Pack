package com.andresnp.orangefrogstickerpack;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StickerIndexingService.enqueueWork(MainActivity.this);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = findViewById(R.id.recyclerview);
        ImageView ivMain = findViewById(R.id.ivMain);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 3);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        List<Sticker> stickerList = StickersDataFactory.getAllStickerReference();
        Adapter myAdapter = new Adapter(MainActivity.this, stickerList, ivMain);
        mRecyclerView.setAdapter(myAdapter);
    }
}
