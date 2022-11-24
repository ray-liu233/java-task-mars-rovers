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

    //向左转
    public void goToLeft() {
        if ("E".equals(this.direction)) {
            this.direction = "N";
        } else if ("S".equals(this.direction)) {
            this.direction = "E";
        } else if ("W".equals(this.direction)) {
            this.direction = "S";
        } else if ("N".equals(this.direction)) {
            this.direction = "W";
        }
    }

    //向右转
    public void goToRight(){
        if("E".equals(this.direction)){
            this.direction = "S";
        } else if("S".equals(this.direction)){
            this.direction = "W";
        } else if("W".equals(this.direction)){
            this.direction = "N";
        } else if("N".equals(this.direction)){
            this.direction = "E";
        }
    }

    //向前进一步
    public void move(){
        if("E".equals(this.direction)){
            this.coordinateX += 1;
        } else if("S".equals(this.direction)){
            this.coordinateY -= 1;
        } else if("W".equals(this.direction)){
            this.coordinateX -= 1;
        } else if("N".equals(this.direction)){
            this.coordinateY += 1;
        }
    }

}
