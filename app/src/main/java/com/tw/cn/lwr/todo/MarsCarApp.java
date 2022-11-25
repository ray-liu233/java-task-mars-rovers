package com.tw.cn.lwr.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarsCarApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<MarsCar> carList=new ArrayList<>();
        System.out.println("请输入平台右上角的坐标：");
        MarsCar.maxCoordinateX=scanner.nextInt();
        MarsCar.maxCoordinateY=scanner.nextInt();
        System.out.println("提醒：如果数据输入完毕，请输入：quit，以便退出系统");
        System.out.println("-----------------------------------------");
        System.out.println("请输入各个小车的x坐标，y坐标，以及小车的朝向：");
        while(!scanner.hasNext("quit")) {
            int coordinateX = scanner.nextInt();
            int coordinateY = scanner.nextInt();
            String direction = scanner.next();
            MarsCar marsCar=new MarsCar(coordinateX,coordinateY,direction);

            if(marsCar.inspectCoordinate()){
                String carInstructions=scanner.next();
                getCarToList(marsCar, carList, carInstructions,scanner);
            } else{
                System.out.println("你的小车坐标输入有误，请重新输入");
            }
        }
        getCarFinalCoordinate(carList);
        scanner.close();
        carList.clear();
        }

    public static void getCarFinalCoordinate(List<MarsCar> carList) {
        if(carList !=null && carList.size()>0) {
            MarsCar marsCar;
            System.out.println("各个小车的最终x坐标，y坐标，以及朝向如下：");
            for (int i = 0; i < carList.size(); i++) {
                marsCar = carList.get(i);
                System.out.println(marsCar.getCoordinateX() + " " +
                        marsCar.getCoordinateY() + " " +
                        marsCar.getDirection());
            }
        }else {
            System.out.println("---------------------");
            System.out.println("暂无小车信息");
        }
    }


    public static void getCarToList(MarsCar marsCar, List<MarsCar> carList, String carInstructions,Scanner scanner){
          if(carInstructions != null && carInstructions.length() > 0){
              boolean tag=true;
              for (int i = 0; i <carInstructions.length() ; i++) {
                  if("M".equals(String.valueOf(carInstructions.charAt(i)))){
                      marsCar.move();
                  } else if ("L".equals(String.valueOf(carInstructions.charAt(i)))) {
                      marsCar.goToLeft();
                  } else if ("R".equals(String.valueOf(carInstructions.charAt(i)))) {
                      marsCar.goToRight();
                  } else{
                      System.out.println("你的命令输入有误，请重新输入");
                      tag=false;
                      break;
                  }
              }
              if (tag){
                  carList.add(marsCar);
              }else {
                  carInstructions =scanner.next();
                  getCarToList(marsCar,carList,carInstructions,scanner);
              }
            }

      }

    }
