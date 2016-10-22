package com.taiwanadministrativearea.tim.lib.Area;

import android.content.Context;

/**
 * Created by tim on 2016/10/23.
 */

public class AreaFactory {

    private Context c;

    public static final int AREA_GROUP_NORTH = 1;
    public static final int AREA_GROUP_SOUTH = 2;
    public static final int AREA_GROUP_EAST = 3;
    public static final int AREA_GROUP_WEST = 4;
    public static final int AREA_GROUP_CENTRAL = 5;
    public static final int AREA_GROUP_ISLANDS = 6;

    public static final int COUNTY_PengHu = 10016;
    public static final int COUNTY_KinMen = 9020;
    public static final int COUNTY_Matsu_Islands = 9007;
    public static final int COUNTY_Keelung = 10017;
    public static final int COUNTY_New_Taipei = 65;
    public static final int COUNTY_TaoYuan = 68;
    public static final int COUNTY_Hsinchu = 10004;
    public static final int COUNTY_Hsinchu_City = 10018;
    public static final int COUNTY_Miaoli = 10005;
    public static final int COUNTY_Taichung_City = 66;
    public static final int COUNTY_Changhua = 10007;
    public static final int COUNTY_Nantou = 10008;
    public static final int COUNTY_Yunlin = 10009;
    public static final int COUNTY_Chiayi = 10010;
    public static final int COUNTY_Chiayi_City = 10020;
    public static final int COUNTY_Tainan_City = 67;
    public static final int COUNTY_Kaohsiung_City = 64;
    public static final int COUNTY_Pingtung = 10013;
    public static final int COUNTY_Taitung = 10014;
    public static final int COUNTY_Yilan = 10002;
    public static final int COUNTY_Hualien = 10015;

    public AreaFactory(Context context){
        c = context;
    }

    private County buildCounty(int id, int nameStrId){
        County county = new County();
        county.setId(id)
                .setName(c, nameStrId);

        return county;
    }



}
