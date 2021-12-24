package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class NewTaipeiCity extends County {

    public NewTaipeiCity(Context context){
        super();
        setName(context.getString(R.string.new_taipei_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.new_taipei_city_list, R.array.new_taipei_ty_post_code);
    }
}
