package com.lililib.taiwanadministrativearea.lib;

import android.content.Context;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.lililib.taiwanadministrativearea.R;

import com.lililib.taiwanadministrativearea.lib.ui.AreaDialogCreator;
import com.lililib.taiwanadministrativearea.lib.ui.OnAreaSelectedListener;

public class TaiwanAreaManager {

    private TextView textView1, textView2;
    private County selectCounty, selectCounty2;
    private Context context;

    public TaiwanAreaManager(Context context){
        this.context = context;
    }

    public void initTextView(TextView textView1, TextView textView2){
        this.textView1 = textView1;
        this.textView2 = textView2;
        textView2.setClickable(false);

        textView1.setOnClickListener(view -> {
            AreaDialogCreator creator = new AreaDialogCreator();
            creator.setSelect(null)
                    .setOnAreaSelectedListener(new FirstLevelAreaSelectListener())
                    .createDialog(context).show();
        });

        textView2.setOnClickListener(view -> {
            AreaDialogCreator creator = new AreaDialogCreator();
            creator.setSelect(selectCounty)
                    .setOnAreaSelectedListener(new SecondLevelAreaSelectListener())
                    .createDialog(context).show();
        });
    }

    public void onDestroy(){

        context = null;

        if(textView2 != null){
            textView2.setOnClickListener(null);
            textView2 = null;
        }

        if(textView1 != null){
            textView1.setOnClickListener(null);
            textView1 = null;
        }
    }

    private class FirstLevelAreaSelectListener implements OnAreaSelectedListener {
        @Override
        public void onSelect(County county) {
            textView1.setText(county.getName());
            textView2.setClickable(true);
            textView2.setText(R.string.pls_select_city);
            selectCounty = county;
            selectCounty2 = null;
        }
    }

    private class SecondLevelAreaSelectListener implements OnAreaSelectedListener{
        @Override
        public void onSelect(County county) {
            textView2.setText(county.getName());
            textView2.setClickable(true);
            selectCounty2 = county;
        }
    }

    /*
    * return user's selection.
    * return "" if user is not select correctly.
    * */
    public String getUserSelectLocation(){
        if(selectCounty == null || selectCounty2 == null){
            return "";
        }

        boolean isEng = context.getResources().getBoolean(R.bool.is_english);
        String split = isEng ? " ,": " ";
        return selectCounty.getName() + split + selectCounty2.getName();
    }

    public int getPostNumber(){
        return selectCounty2 == null ? -1 : selectCounty2.postCode;
    }

}
