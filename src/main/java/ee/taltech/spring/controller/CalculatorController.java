package ee.taltech.spring.controller;

import ee.taltech.spring.dto.CalculationResult;
import ee.taltech.spring.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    @Resource
    private CalculatorService calculatorService;

    @GetMapping("calculate1")
    public CalculationResult calculate1(@RequestParam(value = "input") List<Integer> input) {
        return calculatorService.calculate1(input);
    }

    @GetMapping("calculate2")
    public CalculationResult calculate2(@RequestParam(value = "input") List<Integer> input) {
        return calculatorService.calculate2(input);
    }
}
