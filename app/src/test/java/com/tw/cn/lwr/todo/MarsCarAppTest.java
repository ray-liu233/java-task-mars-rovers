package com.tw.cn.lwr.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MarsCarAppTest {

    @Test
    void should_create_MarsCar_instance_when_car_coordinate_and_instruction_are_correct() {
        MarsCar marsCar = new MarsCar(1,2,"N");
        Scanner scanner=new Scanner(System.in);
        String carInstructions="LMLMLMLMM";
        List<MarsCar> carList=new ArrayList<>();
        MarsCarApp.getCarToList(marsCar,carList,carInstructions,scanner);
        Assertions.assertEquals(1,carList.size());
        Assertions.assertEquals(1,marsCar.getCoordinateX());
        Assertions.assertEquals(3,marsCar.getCoordinateY());
        Assertions.assertEquals("N",marsCar.getDirection());

    }

    @Test
    void should_return_correct_coordinate_answer_when_input_car_list(){
    MarsCar marsCar=new MarsCar(2,3,"E");
    MarsCar marsCar2=new MarsCar(1,2,"N");
    List<MarsCar> carList=new ArrayList<>();
    carList.add(marsCar);
    carList.add(marsCar2);
        for (int i = 0; i < carList.size(); i++) {
            if(i==0){
                Assertions.assertEquals(2, carList.get(i).getCoordinateX());
                Assertions.assertEquals(3, carList.get(i).getCoordinateY());
                Assertions.assertEquals("E", carList.get(i).getDirection());
            }
            if(i==1){
                Assertions.assertEquals(1, carList.get(i).getCoordinateX());
                Assertions.assertEquals(2, carList.get(i).getCoordinateY());
                Assertions.assertEquals("N", carList.get(i).getDirection());
            }
        }
    }
}
