package com.example.robilife.mvpproject.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by khalifa on 1/1/18.
 */

public interface BaseView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
