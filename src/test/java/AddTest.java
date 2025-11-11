import org.example.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void givenEmptyString_whenAdd_thenReturnZero(){

       int result = StringCalculator.add("");
       Assertions.assertEquals(0,result);
    }


}
