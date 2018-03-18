package com.example.robilife.mvpproject;

import android.app.Application;

import com.example.robilife.mvpproject.data.DataManager;
import com.example.robilife.mvpproject.di.component.ApplicationComponent;
import com.example.robilife.mvpproject.di.component.DaggerApplicationComponent;
import com.example.robilife.mvpproject.di.module.ApplicationModule;

import javax.inject.Inject;

import io.realm.Realm;

/**
 * Created by khalifa on 1/1/18.
 */

public class MvpApp extends Application {

    @Inject
    DataManager mDataManager;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
