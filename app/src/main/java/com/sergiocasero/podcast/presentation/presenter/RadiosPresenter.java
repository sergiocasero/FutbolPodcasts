package com.sergiocasero.podcast.presentation.presenter;

import android.util.Log;

import com.sergiocasero.podcast.domain.interactor.GetAllRadiosUseCase;
import com.sergiocasero.podcast.domain.interactor.UseCase;
import com.sergiocasero.podcast.domain.model.Radio;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import rx.Subscriber;

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
        allRadiosUseCase.execute(new Subscriber<List<Radio>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                throw new RuntimeException(e);
            }

            @Override
            public void onNext(List<Radio> radios) {
                Log.i(TAG, radios.toString());
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

    public interface View extends Presenter.View {

    }
}
