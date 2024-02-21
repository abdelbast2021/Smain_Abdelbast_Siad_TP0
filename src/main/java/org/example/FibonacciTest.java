package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
     public void n_lest_then_zero(){
        try{
            Fibonacci.fibonacci(-2);

        }catch (IllegalArgumentException e) {
            // Verify that the caught exception is of the expected type
            Assertions.assertEquals("n must be positive", e.getMessage());
        }

    }

    @Test
        public void n_equales_zero(){
            int result =Fibonacci.fibonacci(0);
            Assertions.assertEquals(0,result);

    }

    @Test
    public void n_equales_one(){
        int result =Fibonacci.fibonacci(1);
        Assertions.assertEquals(1,result);

    }
    @Test
        public void Fibonacci_test(){
            int result = Fibonacci.fibonacci(8);
            Assertions.assertEquals(21,result);

    }

}
