package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class ChanghuaCounty extends County {

    public ChanghuaCounty(Context context){
        super();
        setName(context.getString(R.string.changhua_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.changhuaCounty_list, R.array.changhuaCounty_post_code);
    }
}
