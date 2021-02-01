package ee.taltech.spring.util;

import java.util.ArrayList;
import java.util.List;

public class PositivesUtil {
    public static List<Integer> positives(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : input) {
            if (number >= 0) {
                result.add(number);
            }
        }
        if (result.isEmpty()) {
            return null;
        }
        return result;
    }
}
