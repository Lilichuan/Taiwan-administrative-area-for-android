package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.ArrayList;
import java.util.List;

public class TaipeiCity extends County {

    public TaipeiCity(Context context){
        super();
        setName(context.getString(R.string.taipei_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        List<County> list = new ArrayList<>();
        String[] strlist = context.getResources().getStringArray(R.array.taipei_city_list);
        int[] postCodeArray = context.getResources().getIntArray(R.array.taipei_city_post_code);

        for (int i = 0;i < strlist.length ;i++) {
            list.add(new BasicCounty(strlist[i++], postCodeArray[i]));
        }
        return null;
    }

    @Override
    public int getPostCode() {
        return super.getPostCode();
    }

    @Override
    public boolean haveSubArea() {
        return true;
    }
}
