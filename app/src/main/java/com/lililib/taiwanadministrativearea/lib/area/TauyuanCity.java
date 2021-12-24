package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class TauyuanCity extends County {

    public TauyuanCity(Context context){
        super();
        setName(context.getString(R.string.tauyuan_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.tauyuanCity_list, R.array.tauyuanCity_list_post_code);
    }
}
