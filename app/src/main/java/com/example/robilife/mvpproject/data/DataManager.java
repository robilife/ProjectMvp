/*
It is the only part of model that interacts with presenter and vice versa,
 for interaction among other parts of model and presenter, datamanager acts as a middleman.
 */

package com.example.robilife.mvpproject.data;

import com.example.robilife.mvpproject.data.api.ApiHelper;
import com.example.robilife.mvpproject.data.db.DbHelper;
import com.example.robilife.mvpproject.data.prefs.PreferencesHelper;

/**
 * Created by khalifa on 1/1/18.
 */

public interface DataManager extends DbHelper,ApiHelper,PreferencesHelper {

    /*SharedPrefsHelper mSharedPrefsHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void clear() {
        mSharedPrefsHelper.clear();
    }

    public void saveEmailId(String email) {
        mSharedPrefsHelper.putEmail(email);
    }

    public String getEmailId() {
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn() {
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    public Boolean getLoggedInMode() {
        return mSharedPrefsHelper.getLoggedInMode();
    }*/

    void updateApiHeader(Long userId, String accessToken);

    void setUserAsLoggedOut();

    void updateUserInfo(
            String accessToken,
            Long userId,
            LoggedInMode loggedInMode,
            String userName,
            String email,
            String profilePicPath);

    enum LoggedInMode {

        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3);

        private final int mType;

        LoggedInMode(int type) {
            mType = type;
        }

        public int getType() {
            return mType;
        }
    }
}
