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
    }


}
