package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class BasicCounty extends County {

    private String name;

    public BasicCounty(String string){
        name = string;
    }


    @NonNull
    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return null;
    }

    @Override
    public boolean haveSubArea() {
        return false;
    }

    @Override
    public int getPostCode() {
        return 0;
    }
}
