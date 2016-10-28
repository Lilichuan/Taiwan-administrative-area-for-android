package com.taiwanadministrativearea.tim.lib;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tim on 2016/10/23.
 */

public class AreaFactory {

    private Context c;

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

    /*
    *
    * 取得北部縣市列表
    *
    * */
    public List<County> getNorthCounties(){
        List<County> list = new ArrayList<>();
        list.add(createCounty(COUNTY_Keelung));
        list.add(createCounty(COUNTY_New_Taipei));
        list.add(createCounty(COUNTY_TaoYuan));
        list.add(createCounty(COUNTY_Hsinchu));
        list.add(createCounty(COUNTY_Hsinchu_City));
        list.add(createCounty(COUNTY_Miaoli));
        return list;
    }

    /*
    *
    * 取得北部縣市列表
    *
    * */
    public List<County> getSouthCounties(){
        List<County> list = new ArrayList<>();
        list.add(createCounty(COUNTY_Tainan_City));
        list.add(createCounty(COUNTY_Kaohsiung_City));
        list.add(createCounty(COUNTY_Pingtung));
        return list;
    }

    /*
    *
    * 取得北部縣市列表
    *
    * */
    public List<County> getCentralCounties(){
        List<County> list = new ArrayList<>();
        list.add(createCounty(COUNTY_Taichung_City));
        list.add(createCounty(COUNTY_Changhua));
        list.add(createCounty(COUNTY_Nantou));
        list.add(createCounty(COUNTY_Yunlin));
        list.add(createCounty(COUNTY_Chiayi));
        list.add(createCounty(COUNTY_Chiayi_City));
        return list;
    }

    /*
    *
    * 取得北部縣市列表
    *
    * */
    public List<County> getEastCounties(){
        List<County> list = new ArrayList<>();
        list.add(createCounty(COUNTY_Taitung));
        list.add(createCounty(COUNTY_Yilan));
        list.add(createCounty(COUNTY_Hualien));
        return list;
    }

    /*
    *
    * 取得北部縣市列表
    *
    * */
    public List<County> getIslandCounties(){
        List<County> list = new ArrayList<>();
        list.add(createCounty(COUNTY_PengHu));
        list.add(createCounty(COUNTY_KinMen));
        list.add(createCounty(COUNTY_Matsu_Islands));
        return list;
    }

    public List<County> getAllCounties(){
        List<County> list = getNorthCounties();
        list.addAll(getCentralCounties());
        list.addAll(getSouthCounties());
        list.addAll(getEastCounties());
        list.addAll(getIslandCounties());
        return list;
    }


    public County createCounty(int id){

        int strID;
        int arrayID;

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

        return new County(c,strID, id, arrayID);
    }



}
