package com.technovalley.topic.bangla;

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

public class BanglaAlphabetConsonent extends AppCompatActivity {

    private FrameLayout adContainerView;
    private MediaPlayer mp;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setTitle("বাংলা ব্যঞ্জনবর্ণ");
            setContentView(R.layout.activity_bangla_consonant);

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

            findViewById(R.id.alphabet1).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc1); } });
            findViewById(R.id.alphabet2).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc2); } });
            findViewById(R.id.alphabet3).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc3); } });
            findViewById(R.id.alphabet4).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc4); } });
            findViewById(R.id.alphabet5).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc5); } });
            findViewById(R.id.alphabet6).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc6); } });
            findViewById(R.id.alphabet7).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc7); } });
            findViewById(R.id.alphabet8).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc8); } });
            findViewById(R.id.alphabet9).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc9); } });
            findViewById(R.id.alphabet10).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc10); } });
            findViewById(R.id.alphabet11).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc11); } });
            findViewById(R.id.alphabet12).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc12); } });
            findViewById(R.id.alphabet13).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc13); } });
            findViewById(R.id.alphabet14).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc14); } });
            findViewById(R.id.alphabet15).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc15); } });
            findViewById(R.id.alphabet16).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc16); } });
            findViewById(R.id.alphabet17).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc17); } });
            findViewById(R.id.alphabet18).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc18); } });
            findViewById(R.id.alphabet19).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc19); } });
            findViewById(R.id.alphabet20).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc20); } });
            findViewById(R.id.alphabet21).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc21); } });
            findViewById(R.id.alphabet22).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc22); } });
            findViewById(R.id.alphabet23).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc23); } });
            findViewById(R.id.alphabet24).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc24); } });
            findViewById(R.id.alphabet25).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc25); } });
            findViewById(R.id.alphabet26).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc26); } });
            findViewById(R.id.alphabet27).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc28); } });
            findViewById(R.id.alphabet28).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc29); } });
            findViewById(R.id.alphabet29).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc30); } });
            findViewById(R.id.alphabet30).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc31); } });
            findViewById(R.id.alphabet31).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc32); } });
            findViewById(R.id.alphabet32).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc33); } });
            findViewById(R.id.alphabet33).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc34); } });
            findViewById(R.id.alphabet34).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc35); } });
            findViewById(R.id.alphabet35).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.bc27); } });

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
        Intent i = new Intent(getApplicationContext(), BanglaTopic.class);
        startActivity(i);
    }
}