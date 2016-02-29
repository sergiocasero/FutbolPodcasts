package com.sergiocasero.podcast.presentation.view;

import android.os.Bundle;

import com.sergiocasero.podcast.R;
import com.sergiocasero.podcast.di.component.DaggerRadiosComponent;
import com.sergiocasero.podcast.di.component.RadiosComponent;
import com.sergiocasero.podcast.presentation.presenter.Presenter;
import com.sergiocasero.podcast.presentation.presenter.RadiosPresenter;

import javax.inject.Inject;

/**
 * Created by sergiocasero on 28/2/16.
 */
public class RadiosActivity extends RootActivity implements RadiosPresenter.View {

    private RadiosComponent radiosComponent;

    @Inject
    RadiosPresenter radiosPresenter;

    @Override
    public int getLayoutResourceId() {
        return R.layout.activity_radios;
    }

    @Override
    public Presenter getPresenter() {
        return radiosPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeDI();
        initializePresenter();
    }

    private void initializePresenter() {
        radiosPresenter.setView(this);
        radiosPresenter.initialize();
    }

    private void initializeDI() {
        radiosComponent = DaggerRadiosComponent.builder()
                .appComponent(getAppComponent())
                .build();

        radiosComponent.inject(this);
    }
}
