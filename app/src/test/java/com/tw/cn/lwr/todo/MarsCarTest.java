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
    void marsCar_should_turn_to_correct_direction_when_go_to_left(){
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

    @Test
    void marsCar_should_turn_to_correct_direction_when_go_to_right(){
        MarsCar marsCar=new MarsCar(2,3,"E");
        marsCar.goToRight();
        Assertions.assertEquals("S",marsCar.getDirection());
        marsCar.goToRight();
        Assertions.assertEquals("W",marsCar.getDirection());
        marsCar.goToRight();
        Assertions.assertEquals("N",marsCar.getDirection());
        marsCar.goToRight();
        Assertions.assertEquals("E",marsCar.getDirection());
    }

    @Test
    void marsCar_should_move_distance_when_face_to_corresponding_direction(){
        MarsCar marsCar=new MarsCar(4,2,"E");
        marsCar.move();
        Assertions.assertEquals(5,marsCar.getCoordinateX());//(5,2)
        marsCar.goToRight();
        marsCar.move();
        Assertions.assertEquals(1,marsCar.getCoordinateY());//(5,1)
        marsCar.goToRight();
        marsCar.move();
        Assertions.assertEquals(4,marsCar.getCoordinateX());//(4,1)
        marsCar.goToRight();
        marsCar.move();
        Assertions.assertEquals(2,marsCar.getCoordinateY());//(4,2)
    }
}