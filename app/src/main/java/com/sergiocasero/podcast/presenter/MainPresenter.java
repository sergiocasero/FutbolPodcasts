package com.sergiocasero.podcast.presenter;

import com.karumi.rosie.domain.usecase.UseCaseHandler;
import com.karumi.rosie.view.RosiePresenter;

/**
 * Created by sergiocasero on 25/2/16.
 */
public class MainPresenter extends RosiePresenter<MainPresenter.View> {

    public MainPresenter(UseCaseHandler useCaseHandler) {
        super(useCaseHandler);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void update() {

    }


    @Override
    protected void pause() {

    }

    @Override
    protected void destroy() {

    }


    public interface View extends RosiePresenter.View {

    }
}
