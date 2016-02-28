package com.sergiocasero.podcast.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sergiocasero on 28/2/16.
 */
public abstract class RootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
    }

    public abstract int getLayoutResourceId();
}
