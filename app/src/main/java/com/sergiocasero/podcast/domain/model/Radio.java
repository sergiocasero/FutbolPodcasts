package com.sergiocasero.podcast.domain.model;

import lombok.Data;

/**
 * Created by sergiocasero on 25/2/16.
 */
@Data
public class Radio {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
