package org.example;

public class StringCalculator {
    public static int add(String... input) {
        int result = 0;

        for (String val : input) {
            if (val.isEmpty()){
                result = result + 0;
            }
            else result += Integer.parseInt(val);
        }

        return result;
    }
}
