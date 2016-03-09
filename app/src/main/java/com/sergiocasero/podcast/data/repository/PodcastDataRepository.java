package com.sergiocasero.podcast.data.repository;

import com.sergiocasero.podcast.data.httpclient.PodcastClient;
import com.sergiocasero.podcast.data.model.RadioDto;
import com.sergiocasero.podcast.data.service.PodcastService;
import com.sergiocasero.podcast.data.model.RadioResponseDto;

import java.util.List;

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
    public Observable<List<RadioDto>> getRadios() {
        return podcastService.getAllRadios();
    }
}
