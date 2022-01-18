package com.lililib.taiwanadministrativearea.lib.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;
import com.lililib.taiwanadministrativearea.lib.TaiwanAreaManager;

import java.util.List;

public class AreaDialogCreator {


    private County county;
    private OnAreaSelectedListener subListener;

    public AreaDialogCreator(){

    }

    public AreaDialogCreator setSelect(@Nullable County county){
        if(county == null){
            return this;
        }

        this.county= county;
        return this;
    }

    public AreaDialogCreator setOnAreaSelectedListener(OnAreaSelectedListener listener){
        subListener = listener;
        return this;
    }

    public AlertDialog createDialog(@NonNull Context context) throws IllegalArgumentException{

        if(subListener == null){
            throw new IllegalArgumentException();
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        List<County> countyList;
        if(county != null && county.haveSubArea()) {
            countyList = county.getSubArea(context);
        }else {
            countyList = TaiwanAreaManager.getFirstLevelList(context);
        }

        MyDialogClickListener myDialogClickListener = new MyDialogClickListener(countyList, subListener);
        MyArrayAdapter arrayAdapter = new MyArrayAdapter(context, countyList);
        builder.setAdapter(arrayAdapter, myDialogClickListener);

        return builder.create();
    }

    private class MyArrayAdapter extends ArrayAdapter<County>{

        public MyArrayAdapter(@NonNull Context context, List<County> list) {
            super(context, R.layout.my_text, R.id.text, list);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            County county = getItem(position);
            if(convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_text, parent);
            }

            TextView textView = (TextView)convertView;
            textView.setText(county.getName());
            return convertView;
        }
    }

    private class MyDialogClickListener implements DialogInterface.OnClickListener{

        private List<County> list;
        private OnAreaSelectedListener subListener;

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
}
