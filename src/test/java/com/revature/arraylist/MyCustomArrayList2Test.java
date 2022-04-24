package com.revature.arraylist;
//https://www.youtube.com/watch?v=fTMXP_IMXDo

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyCustomArrayList2Test {

    private MyCustomArrayList2<Integer> myArrayList2;

    @BeforeEach
    void setup(){
        myArrayList2 = new MyCustomArrayList2<>();
        myArrayList2.add(100);
        myArrayList2.add(200);
        myArrayList2.add(300);
        myArrayList2.add(400);
        myArrayList2.add(500);
    }

    @AfterEach
    void cleanup(){
        myArrayList2=null;
    }

    @Test
    void addNewItemsToTheArrayList() {

        Assertions.assertEquals(5, myArrayList2.size());
    }

    @Test
    void getItemByIndex(){
        Assertions.assertEquals(500,myArrayList2.getItem(4));
    }

    @Test
    void removeItemByIndex(){
        myArrayList2.removeByIndex(2);
        Assertions.assertEquals(4, myArrayList2.size());
        Assertions.assertEquals(100, myArrayList2.getItem(0));
        Assertions.assertEquals(200, myArrayList2.getItem(1));
        Assertions.assertEquals(400, myArrayList2.getItem(2));
        Assertions.assertEquals(500, myArrayList2.getItem(3));
    }

    @Test
    void removeItemByValue(){
        myArrayList2.removeByValue(300);
        Assertions.assertEquals(4, myArrayList2.size());
        Assertions.assertEquals(100, myArrayList2.getItem(0));
        Assertions.assertEquals(200, myArrayList2.getItem(1));
        Assertions.assertEquals(400, myArrayList2.getItem(2));
        Assertions.assertEquals(500, myArrayList2.getItem(3));
    }
}
