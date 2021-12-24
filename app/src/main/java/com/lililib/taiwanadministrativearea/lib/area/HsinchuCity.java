package com.lililib.taiwanadministrativearea.lib.area;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class HsinchuCity extends County {

    public HsinchuCity(Context context){
        super();
        setName(context.getString(R.string.keelung_city));
    }

    @Override
    public List<County> getSubArea(@NonNull Context context) {
        return getArray(context, R.array.HsinchuCity_list, R.array.HsinchuCity_post_code);
    }
}

