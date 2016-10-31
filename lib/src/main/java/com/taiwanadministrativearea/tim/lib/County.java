package com.taiwanadministrativearea.tim.lib;

import android.content.Context;

/**
 * original county interface
 */

public class County {

    public County(Context context, int nameID, int countyID, int arrayID){
        setName(context, nameID);
        setId(countyID);
        setTownsAndCities(context, arrayID);
    }

    //顯示名稱
    private String name;

    private void setName(Context context, int nameID) {
        name = context.getString(nameID);
    }

    public String getName() {
        return name;
    }



    //行政區域及村里代碼
    private int id;

    private void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }



    private String[] townsAndCities;

    private void setTownsAndCities(Context context, int arrayID){
        townsAndCities = context.getResources().getStringArray(arrayID);
    }

    public String[] getTownsAndCities() {
        return townsAndCities;
    }
}
