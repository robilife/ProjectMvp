package com.example.robilife.mvpproject.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.robilife.mvpproject.MvpApp;
import com.example.robilife.mvpproject.R;
import com.example.robilife.mvpproject.data.DataManager;
import com.example.robilife.mvpproject.ui.base.BaseActivity;

import javax.inject.Inject;

/**
 * Created by khalifa on 1/2/18.
 */

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenterImpl<MainView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);
        //mPresenter.onAttach(this);

        //mPresenter.

       /* DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mainPresenter = new MainPresenterImpl(dataManager);
        mainPresenter.onAttach(this);*/


        /*buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLoggedOut();
            }
        });*/

    }


    @Override
    public void openSplashActivity() {

    }
}
