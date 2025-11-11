package org.example;

public class StringCalculator {
    public static int add(String s) {
        if(!"".equals(s)){
            return Integer.valueOf(s);
        }
        return 0;
    }
}
