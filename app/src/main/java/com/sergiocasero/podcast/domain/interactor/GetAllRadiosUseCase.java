package com.sergiocasero.podcast.domain.interactor;

import com.sergiocasero.podcast.data.mapper.RadioDtoMapper;
import com.sergiocasero.podcast.data.repository.PodcastRepository;
import com.sergiocasero.podcast.domain.model.Radio;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;

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
    protected Observable<List<Radio>> buildObservable() {
        RadioDtoMapper radioDtoMapper = new RadioDtoMapper();
        return podcastRepository.getRadios()
                .flatMap(Observable::from)
                .map(radioDtoMapper::dataToModel)
                .toList();
    }
}
