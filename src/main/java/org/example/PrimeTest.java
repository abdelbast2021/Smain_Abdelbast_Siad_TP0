package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeTest {
    @Test
    void one_prime() {
        boolean result = Prime.isPrime(1);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    void less_then_zero() {
        boolean result = Prime.isPrime(-1);
        assertEquals(Boolean.FALSE, result);
    }
    @Test
    void n_prime() {
        boolean result = Prime.isPrime(7);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    void two_prime() {
        boolean result =Prime.isPrime(2);
        assertEquals(Boolean.TRUE, result);
    }
}
