package com.tw.cn.lwr.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsCarTest {

    @Test
    void the_marsCar_should_have_its_corresponding_properties(){
        MarsCar marsCar=new MarsCar(1,1,"N");
        Assertions.assertInstanceOf(MarsCar.class,marsCar);
        Assertions.assertEquals(1,marsCar.getCoordinateX());
        Assertions.assertEquals(1,marsCar.getCoordinateY());
        Assertions.assertEquals("N",marsCar.getDirection());
    }
    @Test
    void marsCar_should_turn_to_right_direction_when_go_to_left(){
       MarsCar marsCar=new MarsCar(1,1,"N");
       marsCar.goToLeft();
       Assertions.assertEquals("W",marsCar.getDirection());
       marsCar.goToLeft();
       Assertions.assertEquals("S",marsCar.getDirection());
       marsCar.goToLeft();
       Assertions.assertEquals("E",marsCar.getDirection());
       marsCar.goToLeft();
       Assertions.assertEquals("N",marsCar.getDirection());
    }
}