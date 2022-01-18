package com.lililib.taiwanadministrativearea.lib;

import android.content.Context;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.lib.area.ChanghuaCounty;
import com.lililib.taiwanadministrativearea.lib.area.ChiayiCity;
import com.lililib.taiwanadministrativearea.lib.area.ChiayiCounty;
import com.lililib.taiwanadministrativearea.lib.area.HsinchuCity;
import com.lililib.taiwanadministrativearea.lib.area.HsinchuCounty;
import com.lililib.taiwanadministrativearea.lib.area.HualienCounty;
import com.lililib.taiwanadministrativearea.lib.area.KaohsiungCity;
import com.lililib.taiwanadministrativearea.lib.area.KeelungCity;
import com.lililib.taiwanadministrativearea.lib.area.KinmenCounty;
import com.lililib.taiwanadministrativearea.lib.area.LienchiangCounty;
import com.lililib.taiwanadministrativearea.lib.area.MiaoliCounty;
import com.lililib.taiwanadministrativearea.lib.area.NantouCounty;
import com.lililib.taiwanadministrativearea.lib.area.NewTaipeiCity;
import com.lililib.taiwanadministrativearea.lib.area.PenghuCounty;
import com.lililib.taiwanadministrativearea.lib.area.PingtungCounty;
import com.lililib.taiwanadministrativearea.lib.area.TaichungCity;
import com.lililib.taiwanadministrativearea.lib.area.TainanCity;
import com.lililib.taiwanadministrativearea.lib.area.TaipeiCity;
import com.lililib.taiwanadministrativearea.lib.area.TaitungCounty;
import com.lililib.taiwanadministrativearea.lib.area.TauyuanCity;
import com.lililib.taiwanadministrativearea.lib.area.YilanCity;
import com.lililib.taiwanadministrativearea.lib.area.YunlinCounty;

import java.util.ArrayList;
import java.util.List;

public class TaiwanAreaManager {

    public static List<County> getFirstLevelList(@NonNull Context context){
        //list.add(new (context));
        List<County> list = new ArrayList<>();
        list.add(new TaipeiCity(context));
        list.add(new NewTaipeiCity(context));
        list.add(new KeelungCity(context));
        list.add(new TauyuanCity(context));
        list.add(new HsinchuCity(context));
        list.add(new HsinchuCounty(context));
        list.add(new MiaoliCounty(context));
        list.add(new TaichungCity(context));
        list.add(new ChanghuaCounty(context));
        list.add(new YunlinCounty(context));
        list.add(new ChiayiCity(context));
        list.add(new ChiayiCounty(context));
        list.add(new TainanCity(context));
        list.add(new KaohsiungCity(context));
        list.add(new YilanCity(context));
        list.add(new HualienCounty(context));
        list.add(new PingtungCounty(context));
        list.add(new TaitungCounty(context));
        list.add(new NantouCounty(context));
        list.add(new PenghuCounty(context));
        list.add(new LienchiangCounty(context));
        list.add(new KinmenCounty(context));
        return list;
    }
}
