package com.tw.cn.lwr.todo;

public class MarsCar {
    private int coordinateX;
    private int coordinateY;
    private String direction;

    static int maxCoordinateX;

    static int maxCoordinateY;

    public MarsCar() {}

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

    public void setCoordinateX(int coordinateX) {
            this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
            this.coordinateY = coordinateY;
    }


    public void setDirection(String direction) {
             this.direction = direction;
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

    //检查坐标是否合格
    public boolean inspectCoordinate(){
    return
           !(this.coordinateX <0 || this.coordinateX > maxCoordinateX
           || this.coordinateY <0 || this.coordinateY > maxCoordinateY
           ||!("E".equals(this.direction)||"W".equals(this.direction)
           ||"S".equals(this.direction)||"N".equals(this.direction)));

    }



}
