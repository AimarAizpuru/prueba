package com.example.dm3_2_08.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class AccederDB {

    private DBOpenHelper dbh;
    private SQLiteDatabase database;
    private static AccederDB instancia;

    public AccederDB(Context context) {
        this.dbh = new DBOpenHelper(context);

    }

    public static AccederDB getInstancia(Context context) {
        if (instancia == null) {
            instancia = new AccederDB(context);
        }
        return instancia;
    }

    /**Datu basera konektazteko*/

    public void konektatu() {
        this.database = dbh.getWritableDatabase();
    }

    /**Datu basetik deskonektazteko*/
    
    public void deskonektatu(){
        if (database != null) {
            this.database.close();
        }
    }

}
