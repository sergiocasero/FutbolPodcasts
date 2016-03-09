package com.sergiocasero.podcast.data.model;

import com.sergiocasero.podcast.data.model.RadioDto;

import java.util.List;

import lombok.Data;

/**
 * Created by sergiocasero on 25/2/16.
 */
@Data
public class RadioResponseDto {
    private List<RadioDto> radios; 
}
