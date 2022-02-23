package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class KeelungCity extends County {

    public KeelungCity(Context context){
        super();
        setName(context.getString(R.string.keelung_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.KeelungCity_list, R.array.KeelungCity_post_code);
    }
}

