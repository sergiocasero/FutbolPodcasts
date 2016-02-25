package com.sergiocasero.podcasts.repository;

import com.sergiocasero.podcasts.httpclient.PodcastClient;
import com.sergiocasero.podcasts.model.RadioResponse;
import com.sergiocasero.podcasts.service.PodcastService;

import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public class PodcastDataRepository implements PodcastRepository {

    private PodcastService podcastService;

    public PodcastDataRepository() {
        podcastService = PodcastClient.createRetrofitService(PodcastService.class, PodcastService.ENDPOINT);
    }

    @Override
    public Observable<RadioResponse> getRadios() {
        return podcastService.getAllRadios();
    }
}
