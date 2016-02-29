package com.sergiocasero.podcast.presentation.presenter;

import com.sergiocasero.podcast.domain.interactor.GetAllRadiosUseCase;
import com.sergiocasero.podcast.domain.interactor.UseCase;

import javax.inject.Inject;
import javax.inject.Named;

import rx.Subscriber;

/**
 * Created by sergiocasero on 28/2/16.
 */
public class RadiosPresenter extends Presenter<RadiosPresenter.View> {

    private GetAllRadiosUseCase allRadiosUseCase;

    @Inject
    public RadiosPresenter(@Named("getAllRadiosUseCase") UseCase getAllRadiosUseCase) {
        this.allRadiosUseCase = (GetAllRadiosUseCase) getAllRadiosUseCase;
    }

    @Override
    public void initialize() {
        allRadiosUseCase.execute(new Subscriber() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

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
