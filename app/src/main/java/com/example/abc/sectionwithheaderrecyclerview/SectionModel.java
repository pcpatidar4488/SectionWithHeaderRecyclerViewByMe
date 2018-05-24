package com.example.abc.sectionwithheaderrecyclerview;

import java.util.ArrayList;

/**
 * Created by abc on 5/24/2018.
 */

public class SectionModel {
    private String sectionLabel;
    private ArrayList<String> itemArrayList;

    public SectionModel(String sectionLabel, ArrayList<String> itemArrayList) {
        this.sectionLabel = sectionLabel;
        this.itemArrayList = itemArrayList;
    }

    public String getSectionLabel() {
        return sectionLabel;
    }

    public ArrayList<String> getItemArrayList() {
        return itemArrayList;
    }
}