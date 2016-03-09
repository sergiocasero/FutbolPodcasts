package com.sergiocasero.podcast.data.service;

import com.sergiocasero.podcast.data.model.RadioDto;
import com.sergiocasero.podcast.data.model.RadioResponseDto;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastService {
    String ENDPOINT = "http://todotelegram.com/sport_podcast";

    @GET("/radio")
    Observable<List<RadioDto>> getAllRadios();

    @GET("/podcast")
    Observable<RadioResponseDto> getPodcasts(@Path("radio") String radio);
}
