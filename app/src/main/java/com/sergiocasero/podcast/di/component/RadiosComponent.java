package com.sergiocasero.podcast.di.component;

import com.sergiocasero.podcast.di.PodcastScope;
import com.sergiocasero.podcast.di.module.RadiosModule;
import com.sergiocasero.podcast.presentation.view.activity.RadiosActivity;

import dagger.Component;

/**
 * Created by sergiocasero on 28/2/16.
 */
@PodcastScope
@Component(dependencies = AppComponent.class, modules = RadiosModule.class)
public interface RadiosComponent {
    void inject(RadiosActivity radiosActivity);
}
