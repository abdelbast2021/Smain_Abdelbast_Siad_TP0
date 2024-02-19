package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");

        Assertions.assertEquals(1, result);

    }

    @Test
    public  void MultipleNumber() {
        RomanNumeral roman = new RomanNumeral();

        int result2 = roman.convert("VIII");
        Assertions.assertEquals(8, result2);
    }


}
