package com.sergiocasero.podcasts.interactor;

import com.sergiocasero.podcasts.model.Radio;
import com.sergiocasero.podcasts.model.RadioResponse;
import com.sergiocasero.podcasts.repository.PodcastRepository;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Created by sergiocasero on 25/2/16.
 */
public class GetAllRadiosUseCase extends Interactor {

    private PodcastRepository podcastRepository;

    public GetAllRadiosUseCase(PodcastRepository podcastRepository) {
        this.podcastRepository = podcastRepository;
    }

    public void execute(Subscriber subscriber) {
        super.execute(subscriber);
    }

    @Override
    protected Observable buildObservable() {
        return podcastRepository.getRadios().map(new Func1<RadioResponse, List<Radio>>() {
            @Override
            public List<Radio> call(RadioResponse radioResponse) {
                return radioResponse.getRadios();
            }
        });
    }
}
