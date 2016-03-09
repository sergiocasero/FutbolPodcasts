package com.sergiocasero.podcast.presentation.application;

import android.app.Application;

import com.frogermcs.dagger2metrics.Dagger2Metrics;
import com.sergiocasero.podcast.BuildConfig;
import com.sergiocasero.podcast.di.component.AppComponent;
import com.sergiocasero.podcast.di.component.DaggerAppComponent;
import com.sergiocasero.podcast.di.module.AppModule;

/**
 * Created by sergiocasero on 28/2/16.
 */
public class PodcastApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        if (BuildConfig.DEBUG) {
            Dagger2Metrics.enableCapturing(this);
        }
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
