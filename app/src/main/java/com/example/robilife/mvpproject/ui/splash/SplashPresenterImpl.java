package com.example.robilife.mvpproject.ui.splash;

import com.example.robilife.mvpproject.data.DataManager;
import com.example.robilife.mvpproject.ui.base.BasePresenterImpl;

import javax.inject.Inject;

/**
 * Created by khalifa on 1/2/18.
 */

public class SplashPresenterImpl <V extends SplashView> extends BasePresenterImpl<V> implements SplashPresenter<V> {


    @Inject
    public SplashPresenterImpl(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);


    }

    @Override
    public void decideNextActivity() {


        getMvpView().openMainActivity();
        //getMvpView().openLoginActivity();

       /* if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }*/
    }
}
