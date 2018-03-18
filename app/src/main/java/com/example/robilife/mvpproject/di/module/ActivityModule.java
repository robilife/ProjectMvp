package com.example.robilife.mvpproject.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.robilife.mvpproject.di.ActivityContext;
import com.example.robilife.mvpproject.di.PerActivity;
import com.example.robilife.mvpproject.ui.login.LoginPresenter;
import com.example.robilife.mvpproject.ui.login.LoginPresenterImpl;
import com.example.robilife.mvpproject.ui.login.LoginView;
import com.example.robilife.mvpproject.ui.main.MainPresenter;
import com.example.robilife.mvpproject.ui.main.MainPresenterImpl;
import com.example.robilife.mvpproject.ui.main.MainView;
import com.example.robilife.mvpproject.ui.splash.SplashPresenter;
import com.example.robilife.mvpproject.ui.splash.SplashPresenterImpl;
import com.example.robilife.mvpproject.ui.splash.SplashView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by khalifa on 1/4/18.
 */
@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    @PerActivity
    SplashPresenter<SplashView> provideSplashPresenter(
            SplashPresenterImpl<SplashView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainPresenter<MainView> provideMainPresenter(
            MainPresenterImpl<MainView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginPresenter<LoginView> provideLoginPresenter(
            LoginPresenterImpl<LoginView> presenter
    ){
        return presenter;
    }

}
