package com.sergiocasero.podcast.di.component;

import android.content.Context;

import com.sergiocasero.podcast.di.module.AppModule;
import com.sergiocasero.podcast.view.RootActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sergiocasero on 28/2/16.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(RootActivity activity);

    Context context();
}
