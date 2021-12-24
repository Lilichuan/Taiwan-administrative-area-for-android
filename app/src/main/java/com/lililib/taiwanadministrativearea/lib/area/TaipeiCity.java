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
        return getArray(context, R.array.taipei_city_list, R.array.taipei_city_post_code);
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
