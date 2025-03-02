package ru.sky_pro.calculator.sky.pro_spring_calculator_demo.service;

import org.springframework.stereotype.Service;
import ru.sky_pro.calculator.sky.pro_spring_calculator_demo.controllers.CalculatorService;

@Service

public class CalculatorServiceImpl implements CalculatorService {

    public Integer sum(Integer num1, Integer num2) { return num1 + num2; }

    public Integer subtract(Integer num1, Integer num2) { return num1 - num2; }

    public Integer multiply(Integer num1, Integer num2) { return num1 * num2; }

    public Integer divide(Integer num1, Integer num2) throws ZeroDivideException {

        if (num2 == 0) {
        throw new ZeroDivideException();
        }
        return num1 / num2;
    }
}
