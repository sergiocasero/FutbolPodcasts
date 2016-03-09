package com.sergiocasero.podcast.data.mapper;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface Mapper<D, M> {
    M dataToModel(D data);

    D modelToData(M model);
}
