package com.example.mohsen.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.ScaleRatingBar;

public class ProfileMoviesActivity extends AppCompatActivity {

    String TAG ="ProfileMoviesActivity";
    ScaleRatingBar mScaleRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_movies);

        mScaleRating = findViewById(R.id.profileRatingBar);

        mScaleRating.setOnRatingChangeListener(new BaseRatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChange(BaseRatingBar baseRatingBar, float rating) {
                Log.e(TAG, "onRatingChange: " + rating);
            }


        });
    }
}
