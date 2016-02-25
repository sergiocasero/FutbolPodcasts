package com.sergiocasero.podcasts.interactor;

import com.sergiocasero.podcasts.repository.PodcastRepository;

import rx.Observable;
import rx.Subscriber;

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
        return podcastRepository.getRadios();
    }
}
