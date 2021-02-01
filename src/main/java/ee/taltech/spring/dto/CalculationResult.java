package ee.taltech.spring.dto;

import java.util.List;

public class CalculationResult {
    private Integer min;
    private Integer minOdd;
    private Float averageOfNegatives;
    private List<Integer> absolutes;
    private List<Integer> positives;

    public List<Integer> getPositivesTwo() {
        return positivesTwo;
    }

    public void setPositivesTwo(List<Integer> positivesTwo) {
        this.positivesTwo = positivesTwo;
    }

    private List<Integer> positivesTwo;

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMinOdd() {
        return minOdd;
    }

    public void setMinOdd(Integer minOdd) {
        this.minOdd = minOdd;
    }

    public List<Integer> getPositives() {
        return positives;
    }

    public void setPositives(List<Integer> positives) {
        this.positives = positives;
    }

    public List<Integer> getAbsolutes() {
        return absolutes;
    }

    public void setAbsolute(List<Integer> absolutes) {
        this.absolutes = absolutes;
    }

    public Float getAverageOfNegatives() {
        return averageOfNegatives;
    }

    public void setAverageOfNegatives(Float averageOfNegatives) {
        this.averageOfNegatives = averageOfNegatives;
    }

}
