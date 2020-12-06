package com.andresnp.orangefrogstickerpack;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.StickerViewHolder> {

    private Context mContext;
    private List<Sticker> stickerList;
    private ImageView ivMain;

    Adapter(Context mContext, List<Sticker> stickerList, ImageView ivMain) {
        this.mContext = mContext;
        this.stickerList = stickerList;
        this.ivMain = ivMain;
    }

    @Override
    public StickerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_item_row, parent, false);
        return new StickerViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull StickerViewHolder holder, int i) {
        final String drawableRes = stickerList.get(i).getURL();
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            URL url = new URL(drawableRes);
            holder.mImage.setImageBitmap(BitmapFactory.decodeStream((InputStream)url.getContent()));
        } catch (IOException e) {
            //Log.e(TAG, e.getMessage());
        }

        holder.mImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL url = null;
                try {
                    url = new URL(drawableRes);
                    ivMain.setImageBitmap(BitmapFactory.decodeStream((InputStream)url.getContent()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return stickerList.size();
    }

    class StickerViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImage;
        StickerViewHolder(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.ivImage);
        }
    }
}


