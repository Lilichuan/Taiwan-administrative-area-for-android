package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class NantouCounty extends County {

    public NantouCounty(Context context){
        super();
        setName(context.getString(R.string.nantou_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.NantouCounty_list, R.array.NantouCounty_post_code);
    }
}

