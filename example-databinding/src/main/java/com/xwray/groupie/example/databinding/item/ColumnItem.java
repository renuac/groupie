package com.xwray.groupie.example.databinding.item;

import com.xwray.groupie.example.databinding.MainActivity;

public class ColumnItem extends CardItem {

    public ColumnItem(int index) {
        super(String.valueOf(index));
        getExtras().put(MainActivity.INSET_TYPE_KEY, MainActivity.INSET);
    }

    @Override public int getSpanSize(int spanCount, int position) {
        return spanCount / 2;
    }
}
