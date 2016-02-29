package com.sergiocasero.podcast.data.repository;

import com.sergiocasero.podcast.data.model.RadioDto;
import com.sergiocasero.podcast.data.model.RadioResponseDto;

import java.util.List;

import rx.Observable;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface PodcastRepository {
    Observable<List<RadioDto>> getRadios();
}
