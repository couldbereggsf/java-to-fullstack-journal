package com.apexlog.model;//This object neatly holds our spatial warehouse coordinates

public class ZoneCoordinate {
    private int row;
    private int column;
    private java.lang.String String;

    public ZoneCoordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "[" + row + ", " + column + "]";
    }
}