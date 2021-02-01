package ee.taltech.spring.util;

import java.util.ArrayList;
import java.util.List;

public class MinOddUtil {
    public static Integer minodd(List<Integer> input) {
        List<Integer> odd = new ArrayList<>();
        for (Integer number : input) {
            if (number % 2 != 0) {
                odd.add(number);
            }
        }
        if (odd.isEmpty()) {
            return null;
        }
        int result = odd.get(0);
        for (Integer number2 : odd) {
            if (number2 < result) {
                result = number2;
            }
        }
        return result;
    }
}
