package com.sergiocasero.podcast.data.repository;

import com.sergiocasero.podcast.data.httpclient.PodcastClient;
import com.sergiocasero.podcast.data.service.PodcastService;
import com.sergiocasero.podcast.domain.model.RadioResponse;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
@Singleton
public class PodcastDataRepository implements PodcastRepository {

    private PodcastService podcastService;

    @Inject
    public PodcastDataRepository() {
        podcastService = PodcastClient.createRetrofitService(PodcastService.class, PodcastService.ENDPOINT);
    }

    @Override
    public Observable<RadioResponse> getRadios() {
        return podcastService.getAllRadios();
    }
}
