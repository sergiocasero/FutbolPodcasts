package com.sergiocasero.podcasts.mapper;

/**
 * Created by sergiocasero on 25/2/16.
 */
public interface Mapper<D, M> {
    M dataToModel(D data);

    D modelToData(M model);
}
