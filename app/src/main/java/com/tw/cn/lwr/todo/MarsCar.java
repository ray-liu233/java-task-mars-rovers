package com.tw.cn.lwr.todo;

public class MarsCar {
    private int coordinateX;
    private int coordinateY;
    private String direction;

    public MarsCar(int coordinateX, int coordinateY, String direction){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public String getDirection() {
        return direction;
    }

}
