package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class KinmenCounty extends County {

    public KinmenCounty(Context context){
        super();
        setName(context.getString(R.string.kinmen_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.KinmenCounty_list, R.array.KinmenCounty_post_code);
    }
}
