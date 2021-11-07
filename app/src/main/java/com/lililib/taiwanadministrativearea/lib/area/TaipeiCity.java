package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.ArrayList;
import java.util.List;

public class TaipeiCity extends County {

    private String name;

    public TaipeiCity(Context context){
        super();
        name = context.getString(R.string.taipei_city);
    }

    @NonNull
    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        List<County> list = new ArrayList<>();
        String[] strlist = context.getResources().getStringArray(R.array.taipei_city_list);
        for (String s : strlist){
            list.add();
        }
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
