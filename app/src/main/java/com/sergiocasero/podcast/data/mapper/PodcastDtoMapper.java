package com.sergiocasero.podcast.data.mapper;

import com.sergiocasero.podcast.data.model.PodcastDto;
import com.sergiocasero.podcast.domain.model.Podcast;

import javax.inject.Inject;

/**
 * Created by sergiocasero on 9/3/16.
 */
public class PodcastDtoMapper implements Mapper<PodcastDto, Podcast> {

    @Inject
    public  PodcastDtoMapper() {
    }

    @Override
    public Podcast dataToModel(PodcastDto data) {
        return null;
    }

    @Override
    public PodcastDto modelToData(Podcast model) {
        return null;
    }
}
