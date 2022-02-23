package com.lililib.taiwanadministrativearea.lib.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lililib.taiwanadministrativearea.R;
import com.lililib.taiwanadministrativearea.lib.TaiwanAreaManager;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelectAreaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SelectAreaFragment extends Fragment {

    private static final String MODE = "param1";
    private boolean isHorizon = false;
    private TextView textView1, textView2;
    private TaiwanAreaManager manager;


    public SelectAreaFragment() {
        // Requir empty public constructor
    }

    public static SelectAreaFragment newInstance(boolean isHorizon) {
        SelectAreaFragment fragment = new SelectAreaFragment();
        Bundle args = new Bundle();
        args.putBoolean(MODE, isHorizon);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            isHorizon = getArguments().getBoolean(MODE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int res = isHorizon ? R.layout.fragment_select_area_ii : R.layout.fragment_select_area;
        View root = inflater.inflate(res, container, false);
        textView1 = root.findViewById(R.id.first_level_input_textview);
        textView2 = root.findViewById(R.id.second_level_input_textview);
        manager = new TaiwanAreaManager(getContext());
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        manager.initTextView(textView1, textView2);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        manager.onDestroy();
    }
}