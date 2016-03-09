package com.sergiocasero.podcast.data.model;

import java.util.List;

import lombok.Data;

/**
 * Created by sergiocasero on 9/3/16.
 */
@Data
public class PodcastResponseDto {
    private List<PodcastDto> podcasts;
}
