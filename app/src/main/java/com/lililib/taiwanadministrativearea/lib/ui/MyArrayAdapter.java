package com.lililib.taiwanadministrativearea.lib.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.County;

import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<County> {

    public MyArrayAdapter(@NonNull Context context, List<County> list) {
        super(context, R.layout.my_text, R.id.text, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        County county = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_text, parent, false);
        }

        TextView textView = (TextView)convertView;
        textView.setText(county.getName());
        return convertView;
    }
}
