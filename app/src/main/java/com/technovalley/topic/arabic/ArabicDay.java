package com.technovalley.topic.arabic;

import android.content.Intent;
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

public class ArabicDay extends AppCompatActivity {

    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setTitle("আরবি দিনের নাম");
            setContentView(R.layout.activity_arabic_days);

            LinearLayout qureka_banner = (LinearLayout) findViewById(R.id.layout_qureka_banner);
            qureka_banner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(getString(R.string.qureka_banner_url)));
                    startActivity(i);
                }
            });

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