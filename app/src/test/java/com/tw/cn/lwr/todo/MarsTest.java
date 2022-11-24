package com.tw.cn.lwr.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsTest {
    @Test
    void the_mars_should_have_its_corresponding_properties(){
        Mars mars=new Mars(5,5);
        Assertions.assertInstanceOf(Mars.class,mars);
        Assertions.assertEquals(5,mars.getMax_x());
        Assertions.assertEquals(5,mars.getMax_y());
    }
}