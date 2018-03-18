package com.example.robilife.mvpproject.ui.main;

import com.example.robilife.mvpproject.ui.base.BasePresenter;

/**
 * Created by khalifa on 1/2/18.
 */

public interface MainPresenter <V extends MainView> extends BasePresenter<V> {

    String getEmailId();

    void setUserLoggedOut();
}
