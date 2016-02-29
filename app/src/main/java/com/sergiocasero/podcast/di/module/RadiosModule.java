package com.sergiocasero.podcast.di.module;

import com.sergiocasero.podcast.di.PodcastScope;
import com.sergiocasero.podcast.domain.interactor.GetAllRadiosUseCase;
import com.sergiocasero.podcast.domain.interactor.UseCase;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sergiocasero on 28/2/16.
 */
@Module
public class RadiosModule {

    @Provides
    @PodcastScope
    @Named("getAllRadiosUseCase")
    public UseCase getAllRadiosUseCase(GetAllRadiosUseCase getAllRadiosUseCase) {
        return getAllRadiosUseCase;
    }
}
