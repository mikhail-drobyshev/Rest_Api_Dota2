package ee.taltech.spring.util;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.abs;

public class AbsolutesUtil {
    public static List<Integer> absolutes(List<Integer> input) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : input
        ) {
            result.add(abs(value));
        }
        if (result.isEmpty()) {
            return null;
        }
        return result;
    }
}
