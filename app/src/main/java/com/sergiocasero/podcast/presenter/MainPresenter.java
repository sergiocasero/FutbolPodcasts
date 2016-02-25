package com.sergiocasero.podcast.presenter;

import android.util.Log;

import com.sergiocasero.podcasts.interactor.GetAllRadiosUseCase;
import com.sergiocasero.podcasts.model.Radio;
import com.sergiocasero.podcasts.repository.PodcastDataRepository;

import java.util.List;

import rx.Subscriber;

/**
 * Created by sergiocasero on 25/2/16.
 */
public class MainPresenter {

    private static final String TAG = "MainPresenter";
    GetAllRadiosUseCase allRadiosUseCase;

    public MainPresenter() {
        allRadiosUseCase = new GetAllRadiosUseCase(new PodcastDataRepository());
    }

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
                Log.i(TAG, "Hello radios! ");
                for (Radio radio : radios) {
                    Log.i(TAG, radio.getName());
                }
            }
        });
    }

    public interface View {

    }
}
