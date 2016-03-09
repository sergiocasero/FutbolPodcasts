package com.sergiocasero.podcast.presentation.view.activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.LinearLayout;

import com.sergiocasero.podcast.R;
import com.sergiocasero.podcast.di.component.DaggerRadiosComponent;
import com.sergiocasero.podcast.di.component.RadiosComponent;
import com.sergiocasero.podcast.domain.model.Radio;
import com.sergiocasero.podcast.presentation.presenter.Presenter;
import com.sergiocasero.podcast.presentation.presenter.RadiosPresenter;
import com.sergiocasero.podcast.presentation.view.adapter.RadiosAdapter;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;

/**
 * Created by sergiocasero on 28/2/16.
 */
public class RadiosActivity extends RootActivity implements RadiosPresenter.View {

    private static final String TAG = "RadiosActivity";
    private RadiosComponent radiosComponent;

    private RadiosAdapter radiosAdapter;

    @Bind(R.id.radios)
    RecyclerView radios;

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.container)
    LinearLayout container;

    @BindString(R.string.app_name)
    String appName;

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
        initializeUI();
        registerListeners();
    }

    private void initializeDI() {
        radiosComponent = DaggerRadiosComponent.builder()
                .appComponent(getAppComponent())
                .build();

        radiosComponent.inject(this);
    }

    private void initializePresenter() {
        radiosPresenter.setView(this);
        radiosPresenter.initialize();
    }

    private void initializeUI() {
        ButterKnife.bind(this);

        toolbar.setTitle(appName);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, android.R.color.white));
        setSupportActionBar(toolbar);

        radiosAdapter = new RadiosAdapter();
        radios.setAdapter(radiosAdapter);
        radios.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void registerListeners() {
        radiosAdapter.setOnItemClickListener(radio -> radiosPresenter.navigateToRadioDetail(RadiosActivity.this, radio));
    }

    @Override
    public void setRadios(List<Radio> radios) {
        radiosAdapter.setItems(radios);
    }

    @Override
    public void showError(String error) {
        Log.i(TAG, error);
        Snackbar.make(container, error, Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void hideError() {

    }
}
