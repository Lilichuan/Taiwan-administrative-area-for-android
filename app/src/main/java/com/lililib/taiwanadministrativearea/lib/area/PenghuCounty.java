package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class PenghuCounty extends County {

    public PenghuCounty(Context context){
        super();
        setName(context.getString(R.string.penghu_county));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.PenghuCounty_list, R.array.PenghuCounty_post_code);
    }
}
