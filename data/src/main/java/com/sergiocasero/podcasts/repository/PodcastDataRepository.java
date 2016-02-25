package com.sergiocasero.podcasts.repository;

import com.sergiocasero.podcasts.model.Radio;
import com.sergiocasero.podcasts.model.RadioVo;
import com.sergiocasero.podcasts.service.PodcastService;

import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by sergiocasero on 25/2/16.
 */
public class PodcastDataRepository implements PodcastRepository {

    private PodcastService podcastService;

    public PodcastDataRepository() {

    }

    @Override
    public Observable<List<Radio>> getRadios() {
        return podcastService.getAllRadios().flatMap(new Func1<RadioVo, Observable<Radio>>() {
            @Override
            public Observable<Radio> call(RadioVo radioVo) {
                return null;
            }
        }).toList();
    }
}
