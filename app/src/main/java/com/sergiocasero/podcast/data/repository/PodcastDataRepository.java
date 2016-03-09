package com.sergiocasero.podcast.data.repository;

import com.sergiocasero.podcast.data.httpclient.PodcastClient;
import com.sergiocasero.podcast.data.mapper.DtoMapper;
import com.sergiocasero.podcast.data.service.PodcastService;
import com.sergiocasero.podcast.domain.model.Podcast;
import com.sergiocasero.podcast.domain.model.Radio;

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

    private DtoMapper dtoMapper;

    @Inject
    public PodcastDataRepository(DtoMapper dtoMapper) {
        this.dtoMapper = dtoMapper;
        podcastService = PodcastClient.createRetrofitService(PodcastService.class, PodcastService.ENDPOINT);
    }

    @Override
    public Observable<List<Radio>> getRadios() {
        return podcastService.getAllRadios().map(dtoMapper::radiosDtoToBo);
    }

    @Override
    public Observable<List<Podcast>> getPodcasts(int radioId) {
        return podcastService.getPodcasts(radioId).map(dtoMapper::podcastsDtoToBo);
    }
}
