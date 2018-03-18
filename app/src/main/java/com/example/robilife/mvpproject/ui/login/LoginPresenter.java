package com.example.robilife.mvpproject.ui.login;

import com.example.robilife.mvpproject.data.api.model.QuoteOfTheDayResponse;
import com.example.robilife.mvpproject.ui.base.BasePresenter;

/**
 * Created by khalifa on 1/16/18.
 */

public interface LoginPresenter <V extends LoginView> extends BasePresenter<V> {

    void onServerLoginClick(String email, String password);

    void onGoogleLoginClick();

    void onFacebookLoginClick();

    void getQuot();

}
