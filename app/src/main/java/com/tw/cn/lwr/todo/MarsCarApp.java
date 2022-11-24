package com.tw.cn.lwr.todo;

import java.util.List;
import java.util.Scanner;

public class MarsCarApp {

    public static void main(String[] args) {

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
