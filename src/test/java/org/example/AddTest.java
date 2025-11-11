package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTest {

    @Test
    public void givenEmptyString_whenAdd_thenReturnZero(){

       int result = StringCalculator.add("");
       assertThat(result).isEqualTo(0);
    }

    @Test
    public void givenOneNumber_whenAdd_thenReturnSum(){

        int result = StringCalculator.add("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void givenTwoNumbers_whenAdd_thenReturnSum(){

        int result = StringCalculator.add("2,3");
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void givenMoreThanTwoNumbers_whenAdd_thenReturnSum(){

        int result = StringCalculator.add("4,14,7,101");
        assertThat(result).isEqualTo(126);
    }

    @Test
    public void givenInputSeparatedByNewLineCharacter_whenAdd_thenReturnSum(){

        int result = StringCalculator.add("4\n2,5");
        assertThat(result).isEqualTo(11);
    }
}
