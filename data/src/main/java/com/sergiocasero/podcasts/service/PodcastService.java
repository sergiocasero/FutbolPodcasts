package com.sergiocasero.podcasts.service;

import com.sergiocasero.podcasts.model.PodcastVo;
import com.sergiocasero.podcasts.model.RadioVo;

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
    Observable<RadioVo> getAllRadios();

    @GET("/podcast")
    Observable<List<PodcastVo>> getPodcasts(@Path("radio") String radio);
}
