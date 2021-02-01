package ee.taltech.spring.service;

import ee.taltech.spring.dto.CalculationResult;
import ee.taltech.spring.util.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CalculatorService {


    public CalculationResult calculate1(List<Integer> input) {
        CalculationResult result = new CalculationResult();
        result.setMin(MinUtil.min(input));
        result.setMinOdd(MinOddUtil.minodd(input));
        result.setPositives(PositivesUtil.positives(input));
        return result;
    }

    public CalculationResult calculate2(List<Integer> input) {
        CalculationResult result = new CalculationResult();
        result.setAbsolute(AbsolutesUtil.absolutes(input));
        result.setAverageOfNegatives(AvgOfNegUtil.avgOfNegatives(input));
        result.setPositivesTwo(PositivesAnotherWayUtil.positives(input));
        return result;
    }
}
