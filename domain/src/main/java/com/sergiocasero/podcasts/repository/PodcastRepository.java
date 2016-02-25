package com.sergiocasero.podcasts.repository;

import com.sergiocasero.podcasts.model.Radio;

import java.util.List;

import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastRepository {
    Observable<List<Radio>> getRadios();
}
