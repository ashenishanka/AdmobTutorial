package com.ashenishanka.admobtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
private AdView mAdview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdview.loadAd(adRequest);
    }
    @Override
    public void onPause()
    {
        if(mAdview != null)
        {
            mAdview.pause();
        }
        super.onPause();
    }
    @Override
    public void onResume()
    {
        super.onResume();
        if (mAdview != null)
        {
            mAdview.resume();
        }
    }
    @Override
    public void onDestroy()
    {
        if(mAdview != null)
        {
            mAdview.destroy();
        }
        super.onDestroy();
    }
}
