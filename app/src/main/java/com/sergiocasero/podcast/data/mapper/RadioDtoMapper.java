package com.sergiocasero.podcast.data.mapper;

import com.sergiocasero.podcast.data.model.RadioDto;
import com.sergiocasero.podcast.domain.model.Radio;

import javax.inject.Inject;

/**
 * Created by sergiocasero on 29/2/16.
 */
public class RadioDtoMapper implements Mapper<RadioDto, Radio> {

    @Inject
    public RadioDtoMapper() {

    }

    @Override
    public Radio dataToModel(RadioDto data) {
        Radio radio = null;
        if (data != null) {
            radio = new Radio();
            radio.setId(data.getId());
            radio.setLogo(data.getLogo());
            radio.setName(data.getName());
            radio.setUrl(data.getUrl());
        }
        return radio;
    }

    @Override
    public RadioDto modelToData(Radio model) {
        RadioDto radioDto = null;
        if (model != null) {
            radioDto = new RadioDto();
            radioDto.setId(model.getId());
            radioDto.setLogo(model.getLogo());
            radioDto.setName(model.getName());
            radioDto.setUrl(model.getUrl());
        }
        return radioDto;
    }
}
