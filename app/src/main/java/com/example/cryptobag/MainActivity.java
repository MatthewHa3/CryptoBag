package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.MESSAGE";
    public static int xposition = 0;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.detail_container) !=null){
            mTwoPane = true;
        }

        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
//        CoinAdapter.RecyclerViewClickListener listener = new CoinAdapter.RecyclerViewClickListener() {
//            @Override
//            public void onClick(View view, int position) {
//                xposition = position;
//                launchDetailActivity(position);
//            }
//        };
//        mAdapter = new CoinAdapter(Coin.getCoins(), listener);
        RecyclerView.Adapter mAdapter = new CoinAdapter(this, Coin.getCoins(), mTwoPane);
        mRecyclerView.setAdapter(mAdapter);

    }


    private void launchDetailActivity(int position){
        Intent intent = new Intent( this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);
    }
}