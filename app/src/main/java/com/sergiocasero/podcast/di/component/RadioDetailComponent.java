package com.sergiocasero.podcast.di.component;

import com.sergiocasero.podcast.di.PodcastScope;
import com.sergiocasero.podcast.di.module.DetailRadioModule;
import com.sergiocasero.podcast.presentation.view.activity.RadioDetailActivity;

import dagger.Component;

/**
 * Created by sergiocasero on 9/3/16.
 */
@PodcastScope
@Component(dependencies = AppComponent.class, modules = DetailRadioModule.class)
public interface RadioDetailComponent {
    void inject(RadioDetailActivity radioDetailActivity);
}
