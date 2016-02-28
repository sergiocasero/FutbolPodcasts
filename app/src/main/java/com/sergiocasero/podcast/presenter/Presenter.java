package com.sergiocasero.podcast.presenter;

/**
 * Created by sergiocasero on 28/2/16.
 */
public abstract class Presenter<V extends Presenter.View> {

    V view;

    public abstract void initialize();

    public abstract void resume();

    public abstract void pause();

    public abstract void destroy();

    public void setView(V view) {
        this.view = view;
    }

    public interface View {

    }
}
