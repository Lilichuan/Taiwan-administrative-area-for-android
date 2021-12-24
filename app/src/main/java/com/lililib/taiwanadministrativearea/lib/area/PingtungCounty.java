package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class PingtungCounty extends County {

    public PingtungCounty(Context context){
        super();
        setName(context.getString(R.string.pingtung_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.PingtungCounty_list, R.array.PingtungCounty_post_code);
    }
}
