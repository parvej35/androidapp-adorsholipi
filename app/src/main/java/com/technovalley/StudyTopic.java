package com.technovalley;

import android.content.Intent;
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
import com.technovalley.topic.arabic.ArabicAlphabet;
import com.technovalley.topic.bangla.BanglaAlphabetConsonent;
import com.technovalley.topic.bangla.BanglaAlphabetVowel;
import com.technovalley.topic.bangla.BanglaDay;
import com.technovalley.topic.bangla.BanglaMonth;
import com.technovalley.topic.bangla.BanglaNumber;
import com.technovalley.topic.english.EnglishAlphabet;
import com.technovalley.topic.english.EnglishDay;
import com.technovalley.topic.english.EnglishMonth;
import com.technovalley.topic.english.EnglishNumber;

public class StudyTopic extends AppCompatActivity {

    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setTitle(getString(R.string.title));
            setContentView(R.layout.activity_study_topic);

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

            LinearLayout layout = null;

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_arabic_alphabet);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, ArabicAlphabet.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_english_alphabet);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, EnglishAlphabet.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_bangla_vowel);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, BanglaAlphabetVowel.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_bangla_consonant);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, BanglaAlphabetConsonent.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_bangla_number);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, BanglaNumber.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_english_number);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, EnglishNumber.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_arabic_alphabet);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, ArabicAlphabet.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_bangla_day_name);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, BanglaDay.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_bangla_month_name);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, BanglaMonth.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_english_day_name);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, EnglishDay.class);
                    startActivity(i);
                }
            });

            //----------------------------------
            layout = (LinearLayout) findViewById(R.id.layout_english_month_name);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(StudyTopic.this, EnglishMonth.class);
                    startActivity(i);
                }
            });


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

            /*case R.id.exit:
                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Closing Application!")
                        .setMessage("Are you surely want to close this application now?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                ActivityCompat.finishAffinity(StudyTopic.this);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
                return (true);*/
        }
        return (super.onOptionsItemSelected(item));
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(StudyTopic.this, MainActivity.class);
        startActivity(i);
    }
}
