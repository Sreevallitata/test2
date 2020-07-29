package com.hbyadav.myapplication;

import android.R;
import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class AuthNewsfeed<GoogleApiClient> extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private GoogleApiClient googleApiClient;


    @SuppressLint("ResourceType")
    protected <Toolbar> void onCreate() {
        onCreate();
    }

    @SuppressLint("ResourceType")
    protected <Toolbar> void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.layout.activity_auth_newsfeed);

        checkPermission();

        Toolbar toolbar = (Toolbar) findViewById(R.id.accessibilityActionContextClick);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.autofill);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        googleApiClient = new GoogleApiClient.Builder(AuthNewsfeed.this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
        googleApiClient.connect();


    }

}