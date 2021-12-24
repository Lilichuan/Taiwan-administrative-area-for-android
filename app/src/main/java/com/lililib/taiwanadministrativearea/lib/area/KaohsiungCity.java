package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class KaohsiungCity extends County {

    public KaohsiungCity(Context context){
        super();
        setName(context.getString(R.string.kaohsiung_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.kaohsiungCity_list, R.array.kaohsiungCity_post_code);
    }
}

