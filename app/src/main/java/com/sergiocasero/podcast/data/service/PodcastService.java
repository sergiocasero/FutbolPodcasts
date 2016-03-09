package com.sergiocasero.podcast.data.service;

import com.sergiocasero.podcast.data.model.PodcastResponseDto;
import com.sergiocasero.podcast.data.model.RadioResponseDto;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastService {
    String ENDPOINT = "http://todotelegram.com/sport_podcast";

    @GET("/radio")
    Observable<RadioResponseDto> getAllRadios();

    @GET("/podcast")
    Observable<PodcastResponseDto> getPodcasts(@Path("radio") int radio);
}
