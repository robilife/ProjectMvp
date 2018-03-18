package com.example.robilife.mvpproject.di.component;

import com.example.robilife.mvpproject.di.PerActivity;
import com.example.robilife.mvpproject.di.module.ActivityModule;
import com.example.robilife.mvpproject.ui.login.LoginActivity;
import com.example.robilife.mvpproject.ui.main.MainActivity;
import com.example.robilife.mvpproject.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by khalifa on 1/4/18.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity activity);
    void inject(MainActivity activity);
    void inject(LoginActivity activity);
}
