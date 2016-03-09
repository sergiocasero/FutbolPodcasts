package com.sergiocasero.podcast.domain.interactor;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/**
 * Created by sergiocasero on 25/2/16.
 */
public abstract class UseCase {
    private Subscription subscription = Subscriptions.empty();

    public UseCase() {

    }

    public void execute(Subscriber subscriber) {
        subscription = buildObservable()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    protected abstract Observable buildObservable();

    public void unsubscribe() {
        subscription.unsubscribe();
    }
}
