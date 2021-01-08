package com.technovalley;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;
import com.technovalley.topic.arabic.ArabicTopic;
import com.technovalley.topic.bangla.BanglaPoemList;
import com.technovalley.topic.bangla.BanglaTopic;
import com.technovalley.topic.english.EnglishTopic;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private FrameLayout adContainerView;
    private AdView adView;

    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

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

            //----------------------------------
            /*LinearLayout layout = (LinearLayout) findViewById(R.id.layout_banner);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, Slider.class);
                    startActivity(i);
                }
            });*/

            //----------------------------------
            LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout_arabic_topic);
            layout1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, ArabicTopic.class);
                    startActivity(i);
                }
            });

            LinearLayout layout2 = (LinearLayout) findViewById(R.id.layout_bangla_topic);
            layout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, BanglaTopic.class);
                    startActivity(i);
                }
            });

            LinearLayout layout3 = (LinearLayout) findViewById(R.id.layout_english_topic);
            layout3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, EnglishTopic.class);
                    startActivity(i);
                }
            });

            /*LinearLayout layout4 = (LinearLayout) findViewById(R.id.layout_bangla_poem);
            layout4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, BanglaPoemList.class);
                    startActivity(i);
                }
            });*/

            //-------------RATE-THIS-APP---------------------
            /*LinearLayout layout5 = (LinearLayout) findViewById(R.id.layout_ratting);
            layout5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new PlayStoreLink().rateApp(view.getContext());//do not change view.getContext()
                }
            });*/

            //-------------FEEDBACK---------------------
            /*LinearLayout layout = (LinearLayout) findViewById(R.id.layout_feedback);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new PlayStoreLink().rateApp(view.getContext());
                }
            });*/

            //-------------SHARE-THIS-APP---------------------
            LinearLayout layout6 = (LinearLayout) findViewById(R.id.layout_share);
            layout6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new PlayStoreLink().shareApp(view.getContext());//do not change view.getContext()
                }
            });

            //-------------MORE-APP---------------------
            LinearLayout layout7 = (LinearLayout) findViewById(R.id.layout_moreapp);
            layout7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new PlayStoreLink().moreApps(view.getContext());
            }//do not change view.getContext()
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
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (doubleBackToExitPressedOnce) {
                ActivityCompat.finishAffinity(MainActivity.this);
            }

            doubleBackToExitPressedOnce = true;
            Toast.makeText(MainActivity.this, "অ্যাপ বন্ধ করতে পুনরায় ব্যাক বাটনটি চাপুন", Toast.LENGTH_LONG).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 3000);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_topic_bangla) {
            Intent i = new Intent(MainActivity.this, BanglaTopic.class); //do not change MainActivity.this
            startActivity(i);
        } else if (id == R.id.nav_topic_english) {
            Intent i = new Intent(MainActivity.this, EnglishTopic.class);//do not change MainActivity.this
            startActivity(i);
        } else if (id == R.id.nav_topic_arabic) {
            Intent i = new Intent(MainActivity.this, ArabicTopic.class);//do not change MainActivity.this
            startActivity(i);
        } /*else if (id == R.id.nav_bangla_poem) {
            Intent i = new Intent(MainActivity.this, BanglaPoemList.class);//do not change MainActivity.this
            startActivity(i);
        } */ else if (id == R.id.nav_share) {
            new PlayStoreLink().shareApp(MainActivity.this);//do not change MainActivity.this
        } else if (id == R.id.nav_more_app) {
            new PlayStoreLink().moreApps(MainActivity.this);//do not change MainActivity.this
        } else if (id == R.id.nav_rating) {
            new PlayStoreLink().rateApp(MainActivity.this);//do not change view.getContext()
        } else if (id == R.id.nav_version) {
            ImageView image = new ImageView(getApplicationContext());
            image.setImageResource(R.drawable.banner_small);

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setView(image);
            builder.setTitle("আদর্শলিপি - v5.0.1");
            builder.setMessage("\nReleased On :\nJanuary 01, 2021" +
                    "\n\nWhat Changes :\n- Fixed minor bugs.\n- Improved performance.\n- Reduced application size.\n");
            builder.setCancelable(true);

            builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });


            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
