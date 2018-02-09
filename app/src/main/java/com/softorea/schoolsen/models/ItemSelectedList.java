package com.softorea.schoolsen.models;

import java.io.Serializable;

public class ItemSelectedList implements Serializable {

    private static final long serialVersionUID = 465434412;

    public int Position;

    public Boolean isItemSelected;

    public int getPosition() {
        return Position;
    }

    public void setPosition(int position) {
        Position = position;
    }

    public Boolean getIsItemSelected() {
        return isItemSelected;
    }

    public void setIsItemSelected(Boolean isItemSelected) {
        this.isItemSelected = isItemSelected;
    }


}