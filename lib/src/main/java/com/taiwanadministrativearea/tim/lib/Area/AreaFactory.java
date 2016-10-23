package com.taiwanadministrativearea.tim.lib.Area;

import android.content.Context;

import com.taiwanadministrativearea.tim.lib.R;

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


    private County createCounty(int id){

        int strID;

        switch (id){
            case COUNTY_PengHu:
                strID = R.string.county_penghu;
                break;
            case COUNTY_KinMen:
                strID = R.string.county_kinmen;
                break;
            case COUNTY_Matsu_Islands:
                strID = R.string.county_matsu;
                break;
            case COUNTY_Keelung:
                strID = R.string.county_keelung;
                break;
            case COUNTY_New_Taipei:
                strID = R.string.county_new_taipei ;
                break;
            case COUNTY_TaoYuan:
                strID = R.string.county_taoyuan ;
                break;
            case COUNTY_Hsinchu:
                strID = R.string.county_hsinchu ;
                break;
            case COUNTY_Hsinchu_City:
                strID = R.string.county_hsinchu_city ;
                break;
            case COUNTY_Miaoli:
                strID = R.string.county_miaoli ;
                break;
            case COUNTY_Taichung_City:
                strID = R.string.county_taichung_city ;
                break;
            case COUNTY_Changhua:
                strID = R.string.county_changhua ;
                break;
            case COUNTY_Nantou:
                strID = R.string.county_nantou ;
                break;
            case COUNTY_Yunlin:
                strID = R.string.county_yunlin ;
                break;
            case COUNTY_Chiayi:
                strID = R.string.county_chiayi ;
                break;
            case COUNTY_Chiayi_City:
                strID = R.string.county_chiayi_city ;
                break;
            case COUNTY_Tainan_City:
                strID = R.string.county_tainan_city ;
                break;
            case COUNTY_Kaohsiung_City:
                strID = R.string.county_kaohsiung_city ;
                break;
            case COUNTY_Pingtung:
                strID = R.string.county_pingtung ;
                break;
            case COUNTY_Taitung:
                strID = R.string.county_taitung ;
                break;
            case COUNTY_Yilan:
                strID = R.string.county_yilan ;
                break;
            case COUNTY_Hualien:
                strID = R.string.county_hualien ;
                break;
            default:
                strID = 0;
        }

        County county = new County();
        county.setId(id)
                .setName(c, strID);

        return county;
    }



}
