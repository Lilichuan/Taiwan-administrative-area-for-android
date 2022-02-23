package com.lililib.taiwanadministrativearea.lib;

import android.content.Context;

import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.lib.area.BasicCounty;

import java.util.ArrayList;
import java.util.List;

public abstract class County {

    public County(){

    }

    protected String name;
    protected int postCode = -1;
    protected boolean haveSubArea = true;

    public @NonNull
    String getName(){
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setPostCode(int postCode) {
        if(postCode < 1){
            return;
        }
        this.postCode = postCode;
    }

    protected List<County> getArray(@NonNull Context context, @ArrayRes int str_array_res, @ArrayRes int int_array_res){
        List<County> list = new ArrayList<>();
        String[] strlist = context.getResources().getStringArray(str_array_res);
        int[] postCodeArray = context.getResources().getIntArray(int_array_res);
        assert strlist.length == postCodeArray.length;
        for (int i = 0;i < strlist.length ;i++) {
            list.add(new BasicCounty(strlist[i++], postCodeArray[i]));
        }
        return list;
    }

    public int getPostCode() {
        return postCode;
    }

    abstract public List<County> getSubArea(@NonNull Context context);

    public boolean haveSubArea(){
        return haveSubArea;
    }

}
