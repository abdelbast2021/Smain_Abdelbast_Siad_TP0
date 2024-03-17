package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void  less_then_zero() {


        try{
            int result = Factorial.factorial(-2);
        }catch (IllegalArgumentException e) {
            // Verify that the caught exception is of the expected type
            Assertions.assertEquals("n must be positive", e.getMessage());
        }
    }

    @Test
    void one_fact() {
        int result = Factorial.factorial(1);
        assertEquals(1, result);
    }
    @Test
    void zero_fact() {
        int result = Factorial.factorial(0);
        assertEquals(1, result);
    }
    @Test
    void n_fact() {
        int result = Factorial.factorial(5);
        assertEquals(120, result);
    }

}
