package com.example.robilife.mvpproject.ui.main;

import com.example.robilife.mvpproject.data.DataManager;
import com.example.robilife.mvpproject.ui.base.BasePresenterImpl;

import javax.inject.Inject;

/**
 * Created by khalifa on 1/2/18.
 */

public class MainPresenterImpl <V extends MainView> extends BasePresenterImpl<V> implements MainPresenter<V> {


    @Inject
    public MainPresenterImpl(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public String getEmailId() {
        return null;
    }

    @Override
    public void setUserLoggedOut() {

    }
}
