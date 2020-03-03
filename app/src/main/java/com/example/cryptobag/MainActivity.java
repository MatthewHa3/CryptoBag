package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.MESSAGE";
    private Button mButton;
    private Button mBitcoin;
    private Button mEthereum;
    private Button mXrp;
    private Button mBitcoinCash;
    private Button mBitcoinSv;
    private Button mTether;
    private Button mLitecoin;
    private Button mEos;
    private Button mBinance;
    private Button mStellar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btnLaunchActivity);
        mBitcoin = findViewById(R.id.btnBitcoin);
        mEthereum = findViewById(R.id.btnEthereum);
        mXrp = findViewById(R.id.btnXrp);
        mBitcoinCash = findViewById(R.id.btnBitcoinCash);
        mBitcoinSv = findViewById(R.id.btnBitcoinSv);
        mTether = findViewById(R.id.btnTether);
        mLitecoin = findViewById(R.id.btnLitecoin);
        mEos = findViewById(R.id.btnEos);
        mBinance = findViewById(R.id.btnBinance);
        mStellar = findViewById(R.id.btnStellar);

        mBitcoin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("0");
            }
        });

        mEthereum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("1");
            }
        });

        mXrp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("2");
            }
        });

        mBitcoinCash.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("3");
            }
        });

        mBitcoinSv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("4");
            }
        });

        mTether.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("5");
            }
        });

        mLitecoin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("6");
            }
        });

        mEos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("7");
            }
        });

        mBinance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("8");
            }
        });

        mStellar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("9");
            }
        });


        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("Hello from Detailed Activity");
            }
        });


        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                launchDetailActivity("Hello from Detailed Activity");
            }
        });
    }


    private void launchDetailActivity(String message){
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}


