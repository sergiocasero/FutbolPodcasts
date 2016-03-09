package com.sergiocasero.podcast.domain.interactor;

import com.sergiocasero.podcast.data.repository.PodcastRepository;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by sergiocasero on 9/3/16.
 */
public class GetPodcastsByRadioUseCase extends UseCase {

    @Inject
    PodcastRepository podcastRepository;

    @Inject
    public GetPodcastsByRadioUseCase() {

    }

    @Override
    protected Observable buildObservable() {
        return null;
    }
}
