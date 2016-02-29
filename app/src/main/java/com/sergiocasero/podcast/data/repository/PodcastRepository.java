package com.sergiocasero.podcast.data.repository;

import com.sergiocasero.podcast.domain.model.RadioResponse;

import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastRepository {
    Observable<RadioResponse> getRadios();
}
