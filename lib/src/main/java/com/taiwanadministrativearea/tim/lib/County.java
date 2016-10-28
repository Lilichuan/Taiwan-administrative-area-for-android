package com.taiwanadministrativearea.tim.lib;

import android.content.Context;

/**
 * original county interface
 */

public class County {

    public County(Context context, int nameID, int countyID, int array){
        setName(context, nameID);
        setId(countyID);
    }

    //顯示名稱
    private String name;

    public void setName(Context context, int nameID) {
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


}
