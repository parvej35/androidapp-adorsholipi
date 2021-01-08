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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.technovalley.R;

public class EnglishMonth extends AppCompatActivity {

    private FrameLayout adContainerView;
    private MediaPlayer mp;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setTitle("ইংরেজি মাসের নাম");
            setContentView(R.layout.activity_english_month);

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

            findViewById(R.id.month1).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.january); } });
            findViewById(R.id.month2).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.february); } });
            findViewById(R.id.month3).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.march); } });
            findViewById(R.id.month4).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.april); } });
            findViewById(R.id.month5).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.may); } });
            findViewById(R.id.month6).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.june); } });
            findViewById(R.id.month7).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.july); } });
            findViewById(R.id.month8).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.august); } });
            findViewById(R.id.month9).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.september); } });
            findViewById(R.id.month10).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.october); } });
            findViewById(R.id.month11).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.november); } });
            findViewById(R.id.month12).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.december); } });

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