package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class YilanCity extends County {

    public YilanCity(Context context){
        super();
        setName(context.getString(R.string.yilan_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.yilanCity_list, R.array.yilanCity_post_code);
    }
}
