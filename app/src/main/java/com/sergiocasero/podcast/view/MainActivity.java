package com.sergiocasero.podcast.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sergiocasero.podcast.R;
import com.sergiocasero.podcast.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainPresenter.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        MainPresenter mainPresenter = new MainPresenter();

        mainPresenter.initialize();
    }

}
