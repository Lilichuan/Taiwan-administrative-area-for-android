package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class TaichungCity extends County {

    public TaichungCity(Context context){
        super();
        setName(context.getString(R.string.taichung_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.taichungCity_list, R.array.taichungCity_list_post_code);
    }
}
