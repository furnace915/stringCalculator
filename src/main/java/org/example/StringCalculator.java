package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class StringCalculator {
    public static int add(String... input) {

        int result = 0;

        Iterator<String> inputIterator = Arrays.stream(input).iterator();
        while (inputIterator.hasNext()) {
            String current = inputIterator.next();
            if (current.isEmpty()) {
                result += 0;
            } else {
                result += Integer.parseInt(current);
            }
        }
        return result;
    }
}
