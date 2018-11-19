package com.example.dm3_2_08.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DBOpenHelper extends SQLiteAssetHelper {
    private static final String name = "AndroidAppDB.db";
    private static final int version = 1;
    public DBOpenHelper(Context context) {
        super(context, name, null, version);
    }
}
