package com.example.robilife.mvpproject.data.db;

import android.database.Observable;

import com.example.robilife.mvpproject.data.db.model.User;

import java.util.List;

/**
 * Created by khalifa on 1/4/18.
 */

public interface DbHelper {

    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();

}
