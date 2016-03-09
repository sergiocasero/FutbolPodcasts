package com.sergiocasero.podcast.presentation.presenter;

import android.content.Intent;

import com.sergiocasero.podcast.domain.interactor.GetAllRadiosUseCase;
import com.sergiocasero.podcast.domain.interactor.UseCase;
import com.sergiocasero.podcast.domain.model.Radio;
import com.sergiocasero.podcast.presentation.view.activity.RadioDetailActivity;
import com.sergiocasero.podcast.presentation.view.activity.RootActivity;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by sergiocasero on 28/2/16.
 */
public class RadiosPresenter extends Presenter<RadiosPresenter.View> {

    private static final String TAG = "RadiosPresenter";
    private GetAllRadiosUseCase allRadiosUseCase;

    @Inject
    public RadiosPresenter(@Named("getAllRadiosUseCase") UseCase getAllRadiosUseCase) {
        this.allRadiosUseCase = (GetAllRadiosUseCase) getAllRadiosUseCase;
    }

    @Override
    public void initialize() {
        allRadiosUseCase.execute(new GetAllRadiosUseCase.AllRadiosListener() {
            @Override
            public void onRadiosLoaded(List<Radio> radios) {
                view.setRadios(radios);
            }

            @Override
            public void onRadiosError(Throwable e) {
                view.showError(e.toString());
            }
        });
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

    public void navigateToRadioDetail(RootActivity activity, int radioId) {
        Intent intent = new Intent(activity, RadioDetailActivity.class);
        String radio_id = "RADIO_ID";
        intent.putExtra(radio_id, radioId);
        activity.startActivity(intent);
    }

    public interface View extends Presenter.View {

        void setRadios(List<Radio> radios);
    }
}
