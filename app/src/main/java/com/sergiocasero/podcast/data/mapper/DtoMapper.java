package com.sergiocasero.podcast.data.mapper;

import com.sergiocasero.podcast.data.model.PodcastDto;
import com.sergiocasero.podcast.data.model.PodcastResponseDto;
import com.sergiocasero.podcast.data.model.RadioDto;
import com.sergiocasero.podcast.data.model.RadioResponseDto;
import com.sergiocasero.podcast.domain.model.Podcast;
import com.sergiocasero.podcast.domain.model.Radio;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by sergiocasero on 9/3/16.
 */
public class DtoMapper {

    private RadioDtoMapper radioDtoMapper;

    private PodcastDtoMapper podcastDtoMapper;

    @Inject
    public DtoMapper(RadioDtoMapper radioDtoMapper, PodcastDtoMapper podcastDtoMapper) {
        this.radioDtoMapper = radioDtoMapper;
        this.podcastDtoMapper = podcastDtoMapper;
    }

    public List<Podcast> podcastsDtoToBo(PodcastResponseDto podcastResponseDto) {
        List<Podcast> podcasts = new ArrayList<>();
        for (PodcastDto podcastDto : podcastResponseDto.getPodcasts()) {
            podcasts.add(podcastDtoMapper.dataToModel(podcastDto));
        }
        return podcasts;
    }

    public List<Radio> radiosDtoToBo(RadioResponseDto radioResponseDto) {
        List<Radio> radios = new ArrayList<>();

        for (RadioDto radioDto : radioResponseDto.getRadios()) {
            radios.add(radioDtoMapper.dataToModel(radioDto));
        }
        return radios;
    }
}
