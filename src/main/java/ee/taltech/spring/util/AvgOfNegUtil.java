package ee.taltech.spring.util;

import java.util.List;

public class AvgOfNegUtil {
    public static Float avgOfNegatives(List<Integer> input) {
        Float sum = 0f;
        Integer num = 0;
        for (Integer value : input
        ) {
            if (value < 0) {
                sum += value;
                num++;
            }
        }
        return (input.isEmpty()) ? null : sum / num;
    }
}
