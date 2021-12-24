package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class HualienCounty extends County {

    public HualienCounty(Context context){
        super();
        setName(context.getString(R.string.hualien_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.HualienCounty_list, R.array.HualienCounty_post_code);
    }
}
