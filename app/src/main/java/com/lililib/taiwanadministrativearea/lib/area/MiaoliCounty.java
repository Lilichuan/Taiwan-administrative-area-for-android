package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class MiaoliCounty extends County {

    public MiaoliCounty(Context context){
        super();
        setName(context.getString(R.string.miaoli_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.miaoliCounty_list, R.array.miaoliCounty_post_code);
    }
}