package com.sergiocasero.podcasts.httpclient;

import retrofit.RestAdapter;

/**
 * Created by sergiocasero on 25/2/16.
 */
public class PodcastClient {
    public static <T> T createRetrofitService(final Class<T> clazz, final String endPoint) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(endPoint)
                .build();
        T service = restAdapter.create(clazz);

        return service;
    }
}
