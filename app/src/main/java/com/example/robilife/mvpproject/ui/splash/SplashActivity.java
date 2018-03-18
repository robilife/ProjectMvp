package com.example.robilife.mvpproject.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.example.robilife.mvpproject.MvpApp;
import com.example.robilife.mvpproject.R;
import com.example.robilife.mvpproject.data.DataManager;
import com.example.robilife.mvpproject.ui.base.BaseActivity;
import com.example.robilife.mvpproject.ui.login.LoginActivity;
import com.example.robilife.mvpproject.ui.main.Main2Activity;
import com.example.robilife.mvpproject.ui.main.MainActivity;

import javax.inject.Inject;

/**
 * Created by khalifa on 1/2/18.
 */

public class SplashActivity extends BaseActivity implements SplashView {

    @Inject
    SplashPresenterImpl<SplashView> mPresenter;

    Handler handler = new Handler();

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);

        mPresenter.onAttach(this);

        mPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = Main2Activity.getStartIntent(SplashActivity.this);
                startActivity(intent);
                finish();

            }
        },3000);

    }

    @Override
    public void openLoginActivity() {

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = LoginActivity.getStartIntent(SplashActivity.this);
                startActivity(intent);
                finish();

            }
        },3000);

    }

}
