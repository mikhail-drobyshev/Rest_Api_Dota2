package ee.taltech.spring.util;

import java.util.ArrayList;
import java.util.List;

public class PositivesAnotherWayUtil {
    public static List<Integer> positives(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : input
        ) {
            if (Integer.signum(value) == 1)
                result.add(value);
        }
        return (result.isEmpty()) ? null : result;
    }
}