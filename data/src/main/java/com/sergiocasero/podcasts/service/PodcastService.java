package com.sergiocasero.podcasts.service;

import com.sergiocasero.podcasts.model.Podcast;
import com.sergiocasero.podcasts.model.Radio;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastService {
    public static final String ENDPOINT = "http://todotelegram.com/sport_podcast";

    @GET("/radio")
    Observable<Radio> getAllRadios();

    @GET("/podcast")
    Observable<List<Podcast>> getPodcasts(@Path("radio") String radio);
}
