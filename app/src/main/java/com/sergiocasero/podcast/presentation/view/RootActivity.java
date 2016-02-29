package com.sergiocasero.podcast.presentation.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sergiocasero.podcast.application.PodcastApplication;
import com.sergiocasero.podcast.di.component.AppComponent;
import com.sergiocasero.podcast.presentation.presenter.Presenter;

/**
 * Created by sergiocasero on 28/2/16.
 */
public abstract class RootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
    }

    public abstract int getLayoutResourceId();

    public abstract Presenter getPresenter();

    protected AppComponent getAppComponent() {
        return ((PodcastApplication) getApplication()).getAppComponent();
    }
}
