package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

//用來紀錄一個區域名稱的的基本類別
public class BasicCounty extends County {


    public BasicCounty(String string, int postCode){
        setName(string);
        setPostCode(postCode);
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return null;
    }

    @Override
    public boolean haveSubArea() {
        return false;
    }
}
