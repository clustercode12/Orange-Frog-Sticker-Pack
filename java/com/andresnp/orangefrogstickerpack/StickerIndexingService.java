package com.andresnp.orangefrogstickerpack;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.JobIntentService;

import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.FirebaseAppIndex;
import com.google.firebase.appindexing.builders.Indexables;
import com.google.firebase.appindexing.builders.StickerBuilder;
import com.google.firebase.appindexing.builders.StickerPackBuilder;

public class StickerIndexingService extends JobIntentService {
    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        AppIndexingUtil.setStickers(getApplicationContext(), FirebaseAppIndex.getInstance());
    }

    private static final int UNIQUE_JOB_ID = 42;

    public static void enqueueWork(Context context) {
        enqueueWork(context, StickerIndexingService.class, UNIQUE_JOB_ID, new Intent());
    }
}
