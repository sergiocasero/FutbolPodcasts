package com.sergiocasero.podcasts.service;

import com.sergiocasero.podcasts.model.RadioResponse;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastService {
    String ENDPOINT = "http://todotelegram.com/sport_podcast";

    @GET("/radio")
    Observable<RadioResponse> getAllRadios();

    @GET("/podcast")
    Observable<RadioResponse> getPodcasts(@Path("radio") String radio);
}
