package com.technovalley.topic.bangla;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.technovalley.MainActivity;
import com.technovalley.R;
import com.technovalley.topic.Utility;

public class BanglaPoemList extends AppCompatActivity {

    private FrameLayout adContainerView;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setTitle(getString(R.string.bangla_poem));
            setContentView(R.layout.activity_bangla_poem_list);

            Utility.load_poem_details();

            TableRow layout = null;

            layout = (TableRow) findViewById(R.id.hatti_ma_tim_tim);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.HATTI_MA_TIM_TIM);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.ay_ay_chad_mama);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.AY_AY_CHAD_MAMA);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.ghum_parani_mashi_pishi);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.GHUM_PARANI_MASHI_PISHI);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.amader_choto_nodi);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.AMADER_CHOTO_NODI);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.choton_ghumay);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.CHOTON_GHUMAY);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.ayre_ay_tiye);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.AY_RE_AY_TIYE);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.amader_gram);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.AMADER_GRAM);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.amar_pon);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.AMAR_PON);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.ischa);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.ISCHA);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.adorsho_chele);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.ADORSHO_CHELE);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.honhon_ponpon);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.HONHON_PONPON);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.mamar_bari);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.MAMAR_BARI);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.kana_bogir_sa);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.KANA_BOGIR_SA);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.boro_ke);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.BORO_KE);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.chuti);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.CHUTI);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.noton_noton_payra_gulo);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.NOTON_NOTON_PAYRA_GULO);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.paribona);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.PARIBONA);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.khokar_sadh);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.KHOKAR_SADH);
                    startActivity(intent);
                }
            });

            layout = (TableRow) findViewById(R.id.bapu_ram_sapu_re);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), BanglaPoemDetails.class);
                    intent.putExtra(Utility.POEM_TITLE, Utility.BAPU_RAM_SAPU_RE);
                    startActivity(intent);
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
        if (item.getItemId() == R.id.go_back) {
            this.onBackPressed();
            return (true);
        }
        return (super.onOptionsItemSelected(item));
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}