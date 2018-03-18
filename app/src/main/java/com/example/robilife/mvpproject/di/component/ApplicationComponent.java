package com.example.robilife.mvpproject.di.component;

import android.app.Application;
import android.content.Context;

import com.example.robilife.mvpproject.MvpApp;
import com.example.robilife.mvpproject.data.DataManager;
import com.example.robilife.mvpproject.di.ApplicationContext;
import com.example.robilife.mvpproject.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by khalifa on 1/4/18.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp app);

    //void inject(SyncService service);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}
