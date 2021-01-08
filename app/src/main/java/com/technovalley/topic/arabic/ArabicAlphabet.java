package com.technovalley.topic.arabic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.technovalley.R;

public class ArabicAlphabet extends AppCompatActivity {

    private FrameLayout adContainerView;
    private MediaPlayer mp;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setTitle("আরবি বর্ণমালা");
            setContentView(R.layout.activity_arabic_alphabet);

            // Initialize the Mobile Ads SDK.
            MobileAds.initialize(this, new OnInitializationCompleteListener() {
                @Override
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                }
            });

            adContainerView = findViewById(R.id.ad_view_container);
            adView = new AdView(this);
            adView.setAdUnitId(getString(R.string.banner_add_1));
            adContainerView.addView(adView);
            loadBanner();

            findViewById(R.id.layout_1).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.alif); } });
            findViewById(R.id.layout_2).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.ba); } });
            findViewById(R.id.layout_3).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.ta); } });
            findViewById(R.id.layout_4).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.tha); } });
            findViewById(R.id.layout_5).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.jiim); } });
            findViewById(R.id.layout_6).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.hha); } });
            findViewById(R.id.layout_7).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.kha); } });
            findViewById(R.id.layout_8).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.daal); } });
            findViewById(R.id.layout_9).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.thaal); } });
            findViewById(R.id.layout_10).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.ra); } });
            findViewById(R.id.layout_11).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.zay); } });
            findViewById(R.id.layout_12).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.siin); } });
            findViewById(R.id.layout_13).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.shiin); } });
            findViewById(R.id.layout_14).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.saad); } });
            findViewById(R.id.layout_15).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.daad); } });
            findViewById(R.id.layout_16).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.taa); } });
            findViewById(R.id.layout_17).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.thaa); } });
            findViewById(R.id.layout_18).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.ayn); } });
            findViewById(R.id.layout_19).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.ghayn); } });
            findViewById(R.id.layout_20).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.fa); } });
            findViewById(R.id.layout_21).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.qaf); } });
            findViewById(R.id.layout_22).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.kaf); } });
            findViewById(R.id.layout_23).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.lam); } });
            findViewById(R.id.layout_24).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.miim); } });
            findViewById(R.id.layout_25).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.nuun); } });
            findViewById(R.id.layout_26).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.ha); } });
            findViewById(R.id.layout_27).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.waw); } });
            findViewById(R.id.layout_28).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.ya); } });

        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void loadBanner() {
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();

        AdSize adSize = getAdSize();
        adView.setAdSize(adSize);
        adView.loadAd(adRequest);
    }

    private AdSize getAdSize() {
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;

        int adWidth = (int) (widthPixels / density);

        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }

    private void playSound(int audioFileID) {
        stopPlaying();
        mp = MediaPlayer.create(getApplicationContext(), audioFileID);
        mp.start();
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.go_back:
                this.onBackPressed();
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), ArabicTopic.class);
        startActivity(i);
    }
}
