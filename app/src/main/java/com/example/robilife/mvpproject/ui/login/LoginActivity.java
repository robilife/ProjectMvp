package com.example.robilife.mvpproject.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.robilife.mvpproject.R;
import com.example.robilife.mvpproject.data.api.model.QuoteOfTheDayResponse;
import com.example.robilife.mvpproject.ui.base.BaseActivity;
import com.example.robilife.mvpproject.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by khalifa on 1/16/18.
 */

public class LoginActivity extends BaseActivity implements LoginView {

    private static final String TAG = "LoginActivity";

    @Inject
    LoginPresenter<LoginView> mPresenter;

    @BindView(R.id.et_email)
    EditText mEmailEditText;

    @BindView(R.id.et_password)
    EditText mPasswordEditText;


    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getActivityComponent().inject(this);

        ButterKnife.bind(this);

        mPresenter.onAttach(this);

        mPresenter.getQuot();
        

    }

    @OnClick(R.id.btn_server_login)
    void onServerLoginClick(View v) {
        mPresenter.onServerLoginClick(mEmailEditText.getText().toString(),
                mPasswordEditText.getText().toString());

    }

    @OnClick(R.id.ib_google_login)
    void onGoogleLoginClick(View v) {
        mPresenter.onGoogleLoginClick();
    }

    @OnClick(R.id.ib_fb_login)
    void onFbLoginClick(View v) {
        mPresenter.onFacebookLoginClick();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(LoginActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public void setQuote(QuoteOfTheDayResponse quoteOfTheDayResponse) {
        Log.d(TAG, "setQuote: setQuote work"+quoteOfTheDayResponse.getContents());
    }
}
