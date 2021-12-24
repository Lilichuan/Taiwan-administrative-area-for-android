package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class HsinchuCounty extends County {

    public HsinchuCounty(Context context){
        super();
        setName(context.getString(R.string.hsinchu_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.hsinchuCounty_list, R.array.hsinchuCounty_post_code);
    }
}
