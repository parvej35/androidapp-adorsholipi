package com.technovalley.topic.english;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
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

public class EnglishAlphabet extends AppCompatActivity {

    private FrameLayout adContainerView;
    private MediaPlayer mp;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setTitle("ইংরেজি বর্ণমালা");
            setContentView(R.layout.activity_english_alphabet);

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

            findViewById(R.id.alphabet1).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.a); } });
            findViewById(R.id.alphabet2).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.b); } });
            findViewById(R.id.alphabet3).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.c); } });
            findViewById(R.id.alphabet4).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.d); } });
            findViewById(R.id.alphabet5).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.e); } });
            findViewById(R.id.alphabet6).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.f); } });
            findViewById(R.id.alphabet7).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.g); } });
            findViewById(R.id.alphabet8).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.h); } });
            findViewById(R.id.alphabet9).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.i); } });
            findViewById(R.id.alphabet10).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.j); } });
            findViewById(R.id.alphabet11).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.k); } });
            findViewById(R.id.alphabet12).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.l); } });
            findViewById(R.id.alphabet13).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.m); } });
            findViewById(R.id.alphabet14).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.n); } });
            findViewById(R.id.alphabet15).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.o); } });
            findViewById(R.id.alphabet16).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.p); } });
            findViewById(R.id.alphabet17).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.q); } });
            findViewById(R.id.alphabet18).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.r); } });
            findViewById(R.id.alphabet19).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.s); } });
            findViewById(R.id.alphabet20).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.t); } });
            findViewById(R.id.alphabet21).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.u); } });
            findViewById(R.id.alphabet22).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.v); } });
            findViewById(R.id.alphabet23).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.w); } });
            findViewById(R.id.alphabet24).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.x); } });
            findViewById(R.id.alphabet25).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.y); } });
            findViewById(R.id.alphabet26).setOnClickListener(new View.OnClickListener() { public void onClick(View v) { playSound(R.raw.z); } });

            LinearLayout qureka_banner = (LinearLayout) findViewById(R.id.layout_qureka_banner);
            qureka_banner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(getString(R.string.qureka_banner_url)));
                    startActivity(i);
                }
            });

        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void loadBanner() {
        //AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        AdRequest adRequest = new AdRequest.Builder().build();

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
