package com.example.robilife.mvpproject.data;

import android.content.Context;
import android.database.Observable;

import com.example.robilife.mvpproject.data.api.ApiHelper;
import com.example.robilife.mvpproject.data.api.model.QuoteOfTheDayResponse;
import com.example.robilife.mvpproject.data.db.DbHelper;
import com.example.robilife.mvpproject.data.db.model.User;
import com.example.robilife.mvpproject.data.prefs.PreferencesHelper;
import com.example.robilife.mvpproject.di.ApplicationContext;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by khalifa on 1/4/18.
 */
@Singleton
public class AppDataManager implements DataManager {

    private final Context mContext;
    private final DbHelper mDbHelper;
    private final PreferencesHelper mPreferencesHelper;
    private final ApiHelper mApiHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          PreferencesHelper preferencesHelper,
                          ApiHelper apiHelper,
                          DbHelper dbHelper
                          ) {
        mContext = context;
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
        mApiHelper = apiHelper;
    }

    @Override
    public void updateApiHeader(Long userId, String accessToken) {

    }

    @Override
    public void setUserAsLoggedOut() {

    }

    @Override
    public void updateUserInfo(String accessToken, Long userId, LoggedInMode loggedInMode, String userName, String email, String profilePicPath) {

    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return 0;
    }

    @Override
    public void setCurrentUserLoggedInMode(LoggedInMode mode) {

    }

    @Override
    public Long getCurrentUserId() {
        return null;
    }

    @Override
    public void setCurrentUserId(Long userId) {

    }

    @Override
    public String getCurrentUserName() {
        return null;
    }

    @Override
    public void setCurrentUserName(String userName) {

    }

    @Override
    public String getCurrentUserEmail() {
        return null;
    }

    @Override
    public void setCurrentUserEmail(String email) {

    }

    @Override
    public String getCurrentUserProfilePicUrl() {
        return null;
    }

    @Override
    public void setCurrentUserProfilePicUrl(String profilePicUrl) {

    }

    @Override
    public String getAccessToken() {
        return null;
    }

    @Override
    public void setAccessToken(String accessToken) {

    }

    @Override
    public Observable<Long> insertUser(User user) {
        return null;
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return null;
    }

    @Override
    public QuoteOfTheDayResponse getQuot() {
        return mApiHelper.getQuot();
    }
}
