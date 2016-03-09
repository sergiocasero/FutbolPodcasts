package com.sergiocasero.podcast.data.repository;

import com.sergiocasero.podcast.data.model.RadioDto;
import com.sergiocasero.podcast.data.model.RadioResponseDto;
import com.sergiocasero.podcast.domain.model.Podcast;
import com.sergiocasero.podcast.domain.model.Radio;

import java.util.List;

import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastRepository {
    Observable<List<Radio>> getRadios();

    Observable<List<Podcast>> getPodcasts(int radioId);
}
