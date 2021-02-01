package ee.taltech.spring.util;

import java.util.List;

public class MinUtil {

    public static Integer min(List<Integer> input) {
        int result = input.get(0);
        for (Integer number : input) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }
}
