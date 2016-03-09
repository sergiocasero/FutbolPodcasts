package com.sergiocasero.podcast.domain.interactor;

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

    private AllRadiosListener allRadiosListener;

    private List<Radio> radios;

    @Inject
    public GetAllRadiosUseCase(PodcastRepository podcastRepository) {
        this.podcastRepository = podcastRepository;
    }

    public void execute(AllRadiosListener allRadiosListener) {
        this.allRadiosListener = allRadiosListener;
        super.execute(new AllRadiosSubscriber());
    }

    @Override
    protected Observable<List<Radio>> buildObservable() {
        return podcastRepository.getRadios();
    }

    private class AllRadiosSubscriber extends Subscriber<List<Radio>> {

        @Override
        public void onCompleted() {
            allRadiosListener.onRadiosLoaded(GetAllRadiosUseCase.this.radios);
        }

        @Override
        public void onError(Throwable e) {
            allRadiosListener.onRadiosError(e);
        }

        @Override
        public void onNext(List<Radio> radios) {
            GetAllRadiosUseCase.this.radios = radios;
        }
    }

    public interface AllRadiosListener {
        void onRadiosLoaded(List<Radio> radios);

        void onRadiosError(Throwable e);
    }
}
