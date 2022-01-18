package com.lililib.taiwanadministrativearea.lib.ui;

import android.os.Bundle;

import androidx.annotation.IntDef;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lililib.taiwanadministrativearea.R;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelectAreaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SelectAreaFragment extends Fragment {

    private static final String MODE = "param1";
    private boolean mode = false;

    public SelectAreaFragment() {
        // Requir empty public constructor
    }

    public static SelectAreaFragment newInstance(boolean mode) {
        SelectAreaFragment fragment = new SelectAreaFragment();
        Bundle args = new Bundle();
        args.putBoolean(MODE, mode);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mode = getArguments().getBoolean(MODE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_area, container, false);
    }
}