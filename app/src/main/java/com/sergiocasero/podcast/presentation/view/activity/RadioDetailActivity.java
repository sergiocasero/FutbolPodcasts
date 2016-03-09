package com.sergiocasero.podcast.presentation.view.activity;

import android.os.Bundle;

import com.sergiocasero.podcast.R;
import com.sergiocasero.podcast.di.component.DaggerRadioDetailComponent;
import com.sergiocasero.podcast.di.component.RadioDetailComponent;
import com.sergiocasero.podcast.di.module.DetailRadioModule;
import com.sergiocasero.podcast.presentation.presenter.Presenter;
import com.sergiocasero.podcast.presentation.presenter.RadioDetailPresenter;

import javax.inject.Inject;

/**
 * Created by sergiocasero on 9/3/16.
 */
public class RadioDetailActivity extends RootActivity implements RadioDetailPresenter.RadioDetailView {

    @Inject
    RadioDetailPresenter radioDetailPresenter;

    private RadioDetailComponent radioDetailComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeInjector();
        initializePresenter();
    }


    private void initializeInjector() {
        radioDetailComponent = DaggerRadioDetailComponent.builder()
                .appComponent(getAppComponent())
                .detailRadioModule(new DetailRadioModule())
                .build();

        radioDetailComponent.inject(this);
    }

    // FIXME: 9/3/16 HARDCODED STRING??? WTF
    private void initializePresenter() {
        radioDetailPresenter.setView(this);
        radioDetailPresenter.setRadioId((Integer) getIntent().getExtras().get("RADIO_ID"));
        radioDetailPresenter.initialize();
    }

    @Override
    public int getLayoutResourceId() {
        return R.layout.activity_radio_detail;
    }

    @Override
    public Presenter getPresenter() {
        return radioDetailPresenter;
    }

    @Override
    public void showError(String s) {

    }

    @Override
    public void hideError() {

    }
}
