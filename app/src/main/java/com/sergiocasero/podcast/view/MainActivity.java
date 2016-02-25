package com.sergiocasero.podcast.view;

import android.os.Bundle;

import com.karumi.rosie.view.RosieActivity;
import com.sergiocasero.podcast.R;
import com.sergiocasero.podcast.presenter.MainPresenter;

public class MainActivity extends RosieActivity implements MainPresenter.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
