package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class TaitungCounty extends County {

    public TaitungCounty(Context context){
        super();
        setName(context.getString(R.string.taitung_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.TaitungCounty_list, R.array.TaitungCounty_post_code);
    }
}
