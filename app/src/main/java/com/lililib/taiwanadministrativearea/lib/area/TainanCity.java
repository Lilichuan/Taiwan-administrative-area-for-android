package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class TainanCity extends County {

    public TainanCity(Context context){
        super();
        setName(context.getString(R.string.tainan_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.tainanCity_list, R.array.tainanCity_list_post_code);
    }
}

