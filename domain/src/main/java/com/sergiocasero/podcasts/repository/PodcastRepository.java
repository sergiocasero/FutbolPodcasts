package com.sergiocasero.podcasts.repository;

import com.sergiocasero.podcasts.model.RadioResponse;

import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastRepository {
    Observable<RadioResponse> getRadios();
}
