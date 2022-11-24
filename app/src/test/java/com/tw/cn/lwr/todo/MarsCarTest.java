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
    void marsCar_should_move_distance_when_face_to_corresponding_direction() {
        MarsCar marsCar = new MarsCar(4, 2, "E");
        marsCar.move();
        Assertions.assertEquals(5, marsCar.getCoordinateX());//(5,2)
        marsCar.goToRight();
        marsCar.move();
        Assertions.assertEquals(1, marsCar.getCoordinateY());//(5,1)
        marsCar.goToRight();
        marsCar.move();
        Assertions.assertEquals(4, marsCar.getCoordinateX());//(4,1)
        marsCar.goToRight();
        marsCar.move();
        Assertions.assertEquals(2, marsCar.getCoordinateY());//(4,2)
    }
        @Test
        void should_return_correct_value_when_set_car_coordinate(){
            MarsCar marsCar=new MarsCar();
            marsCar.setCoordinateX(2);
            marsCar.setCoordinateY(4);
            marsCar.setDirection("E");

            int[] carCoordinateArray={marsCar.getCoordinateX(),marsCar.getCoordinateY()};
            int[] carTestCoordinateArray={2,4};

            Assertions.assertArrayEquals(carTestCoordinateArray,carCoordinateArray);
            Assertions.assertEquals("E",marsCar.getDirection());
        }

        @Test
        void should_return_correct_answer_when_check_mars_car_coordinate(){
        MarsCar.maxCoordinateX=5;
        MarsCar.maxCoordinateY=4;

        MarsCar marsCar1=new MarsCar(1,2,"N");
        Assertions.assertTrue(marsCar1.inspectCoordinate());

        MarsCar marsCar2=new MarsCar(6,2,"E");
        Assertions.assertFalse(marsCar2.inspectCoordinate());

        MarsCar marsCar3=new MarsCar(3,5,"S");
        Assertions.assertFalse(marsCar3.inspectCoordinate());

        MarsCar marsCar4=new MarsCar(-1,3,"W");
        Assertions.assertFalse(marsCar4.inspectCoordinate());

        MarsCar marsCar5=new MarsCar(3,-2,"S");
        Assertions.assertFalse(marsCar5.inspectCoordinate());

        MarsCar marsCar6=new MarsCar(3,5,"A");
        Assertions.assertFalse(marsCar6.inspectCoordinate());

        }
    }
