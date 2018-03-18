package com.example.robilife.mvpproject.data.db;

import android.content.Context;
import android.database.Observable;

import com.example.robilife.mvpproject.data.db.model.User;
import com.example.robilife.mvpproject.di.ApplicationContext;
import com.example.robilife.mvpproject.di.DatabaseInfo;
import com.example.robilife.mvpproject.di.PreferenceInfo;

import java.util.List;

import javax.inject.Inject;

import io.realm.Realm;

/**
 * Created by khalifa on 1/4/18.
 */

public class AppDbHelper implements DbHelper {

    private Realm realm;

    @Inject
    public AppDbHelper(@ApplicationContext Context context,
                       @DatabaseInfo String dbName) {
        realm = Realm.getDefaultInstance();
    }

    @Override
    public Observable<Long> insertUser(User user) {
        return null;
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return null;
    }

}
