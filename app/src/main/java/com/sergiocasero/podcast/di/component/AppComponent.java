package com.sergiocasero.podcast.di.component;

import com.sergiocasero.podcast.data.repository.PodcastRepository;
import com.sergiocasero.podcast.di.module.AppModule;
import com.sergiocasero.podcast.presentation.view.RootActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sergiocasero on 28/2/16.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(RootActivity activity);

    PodcastRepository getPodcastRepository();
}
