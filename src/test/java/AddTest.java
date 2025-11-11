import org.assertj.core.api.Assertions;
import org.example.StringCalculator;



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



}
