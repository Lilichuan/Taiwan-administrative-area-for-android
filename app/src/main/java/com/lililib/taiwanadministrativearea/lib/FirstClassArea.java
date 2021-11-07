package com.lililib.taiwanadministrativearea.lib;

import androidx.annotation.NonNull;

import java.util.List;

abstract public class FirstClassArea {

    abstract public @NonNull
    String getName();

    abstract List<County> getSubArea();

    abstract boolean haveSubArea();

}
