package com.sergiocasero.podcast.domain.interactor;

import com.sergiocasero.podcast.data.repository.PodcastRepository;
import com.sergiocasero.podcast.domain.model.Podcast;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by sergiocasero on 9/3/16.
 */
public class GetPodcastsByRadioUseCase extends UseCase {

    @Inject
    PodcastRepository podcastRepository;

    private GetPodcastListener getPodcastListener;

    private int radioId;

    @Inject
    public GetPodcastsByRadioUseCase(PodcastRepository podcastRepository) {
        this.podcastRepository = podcastRepository;
    }

    public void execute(int radioId, GetPodcastListener getPodcastListener) {
        this.radioId = radioId;
        this.getPodcastListener = getPodcastListener;
        super.execute(new GetPodcastsSubscriber());
    }

    @Override
    protected Observable<List<Podcast>> buildObservable() {
        return podcastRepository.getPodcasts(radioId);
    }

    private class GetPodcastsSubscriber extends Subscriber<List<Podcast>> {

        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(List<Podcast> podcasts) {

        }
    }

    public interface GetPodcastListener {
        void onPodcastsLoaded(List<Podcast> podcasts);

        void onPodcastError(Throwable e);
    }
}
