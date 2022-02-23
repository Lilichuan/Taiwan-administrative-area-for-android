package com.lililib.taiwanadministrativearea.lib.ui;

import android.content.DialogInterface;

import androidx.annotation.NonNull;

import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class MyDialogClickListener implements DialogInterface.OnClickListener{

    private final List<County> list;
    private final OnAreaSelectedListener subListener;

    public MyDialogClickListener(List<County> list, @NonNull OnAreaSelectedListener listener){
        this.list = list;
        subListener = listener;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        County county = list.get(i);
        subListener.onSelect(county);
    }
}
