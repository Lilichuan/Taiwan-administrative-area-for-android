package com.lililib.taiwanadministrativearea.lib;

import android.content.Context;

import androidx.annotation.NonNull;

import java.util.List;

public abstract class County {

    public County(){

    }

    private String name;
    private int postCode = -1;

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

    public int getPostCode() {
        return postCode;
    }

    abstract public List<County> getSubArea(@NonNull Context context);

    abstract public boolean haveSubArea();

}
