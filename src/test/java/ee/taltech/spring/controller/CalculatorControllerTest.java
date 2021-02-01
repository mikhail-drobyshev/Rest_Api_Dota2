package ee.taltech.spring.controller;

import ee.taltech.spring.dto.CalculationResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalculatorControllerTest {

    @Resource
    private TestRestTemplate restTemplate;

    @Test
    void calculate1_has_required_correct_name_param() {
        ResponseEntity<String> entity = restTemplate.getForEntity("/calculator/calculate1", String.class);
        assertEquals(HttpStatus.BAD_REQUEST, entity.getStatusCode());
    }

    @Test
    void calculate1_returns_a_notice_only() {
        ResponseEntity<CalculationResult> entity = restTemplate.getForEntity("/calculator/calculate1?input=1,2,3", CalculationResult.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertNotNull(entity.getBody());
        CalculationResult result = entity.getBody();
        assertNull(result.getMin());
        assertNull(result.getPositives());
        assertNull(result.getAbsolutes());
        assertNull(result.getAverageOfNegatives());
        assertNull(result.getPositivesTwo());
    }

    @Test
    void calculate2_has_required_correct_name_param() {
        ResponseEntity<String> entity = restTemplate.getForEntity("/calculator/calculate2", String.class);
        assertEquals(HttpStatus.BAD_REQUEST, entity.getStatusCode());
    }

    @Test
    void calculate2_returns_a_notice_only() {
        ResponseEntity<CalculationResult> entity = restTemplate.getForEntity("/calculator/calculate2?input=1,2,3", CalculationResult.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertNotNull(entity.getBody());
        CalculationResult result = entity.getBody();
        assertNull(result.getMin());
        assertNull(result.getPositives());
        assertNull(result.getAbsolutes());
        assertNull(result.getAverageOfNegatives());
        assertNull(result.getPositivesTwo());
    }
}
