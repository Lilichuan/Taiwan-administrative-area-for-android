package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class LienchiangCounty extends County {

    public LienchiangCounty(Context context){
        super();
        setName(context.getString(R.string.lienchiang_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.LienchiangCounty_list, R.array.LienchiangCounty_post_code);
    }
}

