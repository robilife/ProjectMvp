package com.example.robilife.mvpproject.ui.splash;

import com.example.robilife.mvpproject.ui.base.BasePresenter;
import com.example.robilife.mvpproject.ui.base.BaseView;

/**
 * Created by khalifa on 1/2/18.
 */

public interface SplashPresenter <V extends SplashView> extends BasePresenter<V> {

    void decideNextActivity();
}
