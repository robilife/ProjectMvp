package com.example.robilife.mvpproject.ui.login;

import android.util.Log;

import com.example.robilife.mvpproject.R;
import com.example.robilife.mvpproject.data.DataManager;
import com.example.robilife.mvpproject.data.api.model.QuoteOfTheDayResponse;
import com.example.robilife.mvpproject.data.db.model.User;
import com.example.robilife.mvpproject.ui.base.BasePresenterImpl;
import com.example.robilife.mvpproject.utils.CommonUtils;

import javax.inject.Inject;

/**
 * Created by khalifa on 1/16/18.
 */

public class LoginPresenterImpl <V extends LoginView> extends BasePresenterImpl<V> implements LoginPresenter<V> {

    private static final String TAG = "LoginPresenterImpl";

    @Inject
    public LoginPresenterImpl(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public void onServerLoginClick(String email, String password) {

        Log.d(TAG, "onServerLoginClick: "+email);
        Log.d(TAG, "onServerLoginClick: "+password);

        //validate email and password
        if (email == null || email.isEmpty()) {
            getMvpView().onError(R.string.empty_email);
            return;
        }
        if (!CommonUtils.isEmailValid(email)) {
            getMvpView().onError(R.string.invalid_email);
            return;
        }
        if (password == null || password.isEmpty()) {
            getMvpView().onError(R.string.empty_password);
            return;
        }

        getMvpView().showLoading();

    }

    @Override
    public void onGoogleLoginClick() {

    }

    @Override
    public void onFacebookLoginClick() {

    }

    @Override
    public void getQuot() {

        QuoteOfTheDayResponse q = getDataManager().getQuot();

        if (q!=null){
            getMvpView().setQuote(q);
        }
        else{
            getMvpView().onError(R.string.api_retry_error);
        }
    }
}
