package com.sergiocasero.podcast.domain.interactor;

import com.sergiocasero.podcast.data.repository.PodcastRepository;
import com.sergiocasero.podcast.domain.model.Radio;
import com.sergiocasero.podcast.domain.model.RadioResponse;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Created by sergiocasero on 25/2/16.
 */
public class GetAllRadiosUseCase extends UseCase {

    @Inject
    PodcastRepository podcastRepository;

    @Inject
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
