package com.example.robilife.mvpproject.ui.base;

/**
 * Created by khalifa on 1/1/18.
 */

public interface BasePresenter <V extends BaseView> {

    void onAttach(V mvpView);
}
