package com.sergiocasero.podcast.presentation.presenter;

import android.util.Log;

import com.sergiocasero.podcast.domain.model.Radio;

import javax.inject.Inject;

/**
 * Created by sergiocasero on 9/3/16.
 */
public class RadioDetailPresenter extends Presenter<RadioDetailPresenter.RadioDetailView> {

    private static final String TAG = "RadioDetailPresenter";
    private Radio radio;

    @Inject
    public RadioDetailPresenter() {
    }


    @Override
    public void initialize() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }

    public void setRadio(Radio radio) {
        this.radio = radio;
        Log.i(TAG, radio.toString());
    }

    public interface RadioDetailView extends Presenter.View {

    }
}
