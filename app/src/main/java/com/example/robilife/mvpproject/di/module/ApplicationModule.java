package com.example.robilife.mvpproject.di.module;

import android.app.Application;
import android.content.Context;

import com.example.robilife.mvpproject.BuildConfig;
import com.example.robilife.mvpproject.data.AppDataManager;
import com.example.robilife.mvpproject.data.DataManager;
import com.example.robilife.mvpproject.data.api.ApiHelper;
import com.example.robilife.mvpproject.data.api.ApiService;
import com.example.robilife.mvpproject.data.api.AppApiHelper;
import com.example.robilife.mvpproject.data.db.AppDbHelper;
import com.example.robilife.mvpproject.data.db.DbHelper;
import com.example.robilife.mvpproject.data.prefs.AppPreferencesHelper;
import com.example.robilife.mvpproject.data.prefs.PreferencesHelper;
import com.example.robilife.mvpproject.di.ApiInfo;
import com.example.robilife.mvpproject.di.ApplicationContext;
import com.example.robilife.mvpproject.di.DatabaseInfo;
import com.example.robilife.mvpproject.di.PreferenceInfo;
import com.example.robilife.mvpproject.utils.AppConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by khalifa on 1/4/18.
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    /*@Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }*/

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    /*@Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                preferencesHelper.getCurrentUserId(),
                preferencesHelper.getAccessToken());
    }*/

    //Data storage part..
    @Singleton
    @Provides
    RealmConfiguration provideRealmConfiguration()
    {
        return  new RealmConfiguration.Builder().build();
    }

    @Singleton
    @Provides
    Realm provideRealm()
    {
        return Realm.getDefaultInstance();
    }
    //Data storage part end...

    @Singleton
    @Provides
    RxJavaCallAdapterFactory provideRxJavaCallAdapterFactory()
    {
        return  RxJavaCallAdapterFactory
                .create();
    }



    @Singleton
    @Provides
    GsonConverterFactory provideGsonConverterFactory()
    {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return  GsonConverterFactory
                .create(gson);
    }


    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient()
    {
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient client, GsonConverterFactory converterFactory, RxJavaCallAdapterFactory madapterfactory)
    {

        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(madapterfactory)
                .client(client)
                .build();
    }

    @Provides
    @Singleton
    ApiService provideInsuranceServiceApi(Retrofit retrofit)
    {
        return  retrofit.create(ApiService.class);
    }
}
