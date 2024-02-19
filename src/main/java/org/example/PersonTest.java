package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
       public void getFullName(){
        Person p =new Person("smain","abdelabst",23) ;
        String result =p.getFullName();
        Assertions.assertEquals("smain abdelabst", result);

    }

    @Test
    public void isAdult(){
        Person p =new Person("smain","abdelabst",23) ;
        Boolean result =p.isAdult();
        Assertions.assertEquals(Boolean.TRUE, result);

    }

    @Test
    public void isNotAdult(){
        Person p =new Person("smain","abdelabst",17) ;
        Boolean result =p.isAdult();
        Assertions.assertEquals(Boolean.FALSE, result);

    }

}
