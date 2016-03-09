package com.sergiocasero.podcast.presentation.view.activity;

import android.os.Bundle;

import com.sergiocasero.podcast.R;
import com.sergiocasero.podcast.presentation.presenter.Presenter;

/**
 * Created by sergiocasero on 9/3/16.
 */
public class RadioDetailActivity extends RootActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutResourceId() {
        return R.layout.activity_radio_detail;
    }

    @Override
    public Presenter getPresenter() {
        return null;
    }
}
