package com.technovalley.topic.english;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.technovalley.R;

public class EnglishNumber extends AppCompatActivity {

    private FrameLayout adContainerView;
    private MediaPlayer mp;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setTitle("ইংরেজি সংখ্যা");
            setContentView(R.layout.activity_english_number);

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

            findViewById(R.id.layout_0).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e0); } });
            findViewById(R.id.layout_1).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e1); } });
            findViewById(R.id.layout_2).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e2); } });
            findViewById(R.id.layout_3).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e3); } });
            findViewById(R.id.layout_4).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e4); } });
            findViewById(R.id.layout_5).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e5); } });
            findViewById(R.id.layout_6).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e6); } });
            findViewById(R.id.layout_7).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e7); } });
            findViewById(R.id.layout_8).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e8); } });
            findViewById(R.id.layout_9).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e9); } });
            findViewById(R.id.layout_10).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e10); } });

            findViewById(R.id.layout_11).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e11); } });
            findViewById(R.id.layout_12).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e12); } });
            findViewById(R.id.layout_13).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e13); } });
            findViewById(R.id.layout_14).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e14); } });
            findViewById(R.id.layout_15).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e15); } });
            findViewById(R.id.layout_16).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e16); } });
            findViewById(R.id.layout_17).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e17); } });
            findViewById(R.id.layout_18).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e18); } });
            findViewById(R.id.layout_19).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e19); } });
            findViewById(R.id.layout_20).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e20); } });

            findViewById(R.id.layout_21).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e21); } });
            findViewById(R.id.layout_22).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e22); } });
            findViewById(R.id.layout_23).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e23); } });
            findViewById(R.id.layout_24).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e24); } });
            findViewById(R.id.layout_25).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e25); } });
            findViewById(R.id.layout_26).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e26); } });
            findViewById(R.id.layout_27).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e27); } });
            findViewById(R.id.layout_28).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e28); } });
            findViewById(R.id.layout_29).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e29); } });
            findViewById(R.id.layout_30).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e30); } });

            findViewById(R.id.layout_31).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e31); } });
            findViewById(R.id.layout_32).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e32); } });
            findViewById(R.id.layout_33).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e33); } });
            findViewById(R.id.layout_34).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e34); } });
            findViewById(R.id.layout_35).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e35); } });
            findViewById(R.id.layout_36).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e36); } });
            findViewById(R.id.layout_37).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e37); } });
            findViewById(R.id.layout_38).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e38); } });
            findViewById(R.id.layout_39).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e39); } });
            findViewById(R.id.layout_40).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e40); } });

            findViewById(R.id.layout_41).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e41); } });
            findViewById(R.id.layout_42).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e42); } });
            findViewById(R.id.layout_43).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e43); } });
            findViewById(R.id.layout_44).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e44); } });
            findViewById(R.id.layout_45).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e45); } });
            findViewById(R.id.layout_46).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e46); } });
            findViewById(R.id.layout_47).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e47); } });
            findViewById(R.id.layout_48).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e48); } });
            findViewById(R.id.layout_49).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e49); } });
            findViewById(R.id.layout_50).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e50); } });

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

    /*private void playSound(int audioFileID) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), audioFileID);
        mp.start();
    }*/

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
        if (item.getItemId() == R.id.go_back) {
            this.onBackPressed();
            return (true);
        }
        return (super.onOptionsItemSelected(item));
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), EnglishTopic.class);
        startActivity(i);
    }
}