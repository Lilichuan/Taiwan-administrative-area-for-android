package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class YunlinCounty extends County {

    public YunlinCounty(Context context){
        super();
        setName(context.getString(R.string.yunlin_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.YunlinCounty_list, R.array.YunlinCounty_post_code);
    }
}

