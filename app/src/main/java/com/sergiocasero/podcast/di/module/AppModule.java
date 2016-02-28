package com.sergiocasero.podcast.di.module;

import android.content.Context;

import com.sergiocasero.podcast.application.PodcastApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sergiocasero on 28/2/16.
 */
@Module
public class AppModule {
    PodcastApplication podcastApplication;

    public AppModule(PodcastApplication podcastApplication) {
        this.podcastApplication = podcastApplication;
    }

    @Provides
    PodcastApplication provideApplication() {
        return podcastApplication;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return this.podcastApplication;
    }
}
