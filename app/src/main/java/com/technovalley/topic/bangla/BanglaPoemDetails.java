package com.technovalley.topic.bangla;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.technovalley.R;
import com.technovalley.topic.Utility;

public class BanglaPoemDetails extends AppCompatActivity {

    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_poem);
            setTitle(getString(R.string.bangla_poem));

            TextView titleTextView = (TextView) findViewById(R.id.poem_title);
            TextView writerTextView = (TextView) findViewById(R.id.poem_writer);
            LinearLayout contentLinearLayout = (LinearLayout) findViewById(R.id.poem_content);

            Intent intent = getIntent();
            String selectedPoem = (String) intent.getSerializableExtra(Utility.POEM_TITLE);

            String[] poem_details_array = Utility.BANGLA_POEM_DETAILS_MAP.get(selectedPoem);
            if (poem_details_array != null && poem_details_array.length > 0) {
                titleTextView.setText(poem_details_array[0]);
                writerTextView.setText(poem_details_array[1]);

                for (int i = 2; i < poem_details_array.length; i++) {
                    TextView textView = new TextView(this);
                    textView.setText(poem_details_array[i]);
                    textView.setTextColor(Color.BLACK);
                    textView.setGravity(Gravity.CENTER);
                    textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f);
                    contentLinearLayout.addView(textView);
                }
            } else {
                titleTextView.setText(selectedPoem);
                writerTextView.setText("");
            }

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

            Intent i = new Intent(getApplicationContext(), BanglaPoemList.class);
            startActivity(i);
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
        if (item.getItemId() == R.id.go_back) {
            this.onBackPressed();
            return (true);
        }
        return (super.onOptionsItemSelected(item));
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), BanglaPoemList.class);
        startActivity(i);
    }
}