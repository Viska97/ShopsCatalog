package com.visapps.shopscatalog;

import android.app.Application;

import io.realm.Realm;

public class ShopsCatalog extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(getApplicationContext());
    }

}
