package com.example.robilife.mvpproject.ui.base;

import com.example.robilife.mvpproject.data.DataManager;

/**
 * Created by khalifa on 1/1/18.
 */

public class BasePresenterImpl <V extends BaseView> implements BasePresenter<V> {

    DataManager mDataManager;
    private V mMvpView;

    public BasePresenterImpl(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}
