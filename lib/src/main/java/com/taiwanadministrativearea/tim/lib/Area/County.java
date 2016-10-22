package com.taiwanadministrativearea.tim.lib.Area;

import android.content.Context;

/**
 * Created by tim on 2016/10/21.
 */

public class County {

    //顯示名稱
    private String name;

    public County setName(Context context, int nameID) {
        name = context.getString(nameID);
        return this;
    }

    public String getName() {
        return name;
    }



    //行政區域及村里代碼
    private int id;

    public County setId(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
    }
}
