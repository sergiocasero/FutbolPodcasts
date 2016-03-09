package com.sergiocasero.podcast.presentation.presenter;

import javax.inject.Inject;

/**
 * Created by sergiocasero on 9/3/16.
 */
public class RadioDetailPresenter extends Presenter<RadioDetailPresenter.RadioDetailView> {

    private int radioId;

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

    public void setRadioId(int radioId) {
        this.radioId = radioId;
    }

    public interface RadioDetailView extends Presenter.View {

    }
}
