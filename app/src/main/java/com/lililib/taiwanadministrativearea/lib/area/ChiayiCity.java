package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class ChiayiCity extends County {

    public ChiayiCity(Context context){
        super();
        setName(context.getString(R.string.chiayi_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.ChiayiCity_list, R.array.ChiayiCity_post_code);
    }
}
