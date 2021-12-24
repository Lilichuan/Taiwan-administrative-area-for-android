package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class ChiayiCounty extends County {

    public ChiayiCounty(Context context){
        super();
        setName(context.getString(R.string.chiayi_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.ChiayiCounty_list, R.array.ChiayiCounty_post_code);
    }
}
