package ru.sky_pro.calculator.sky.pro_spring_calculator_demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServicelmpl implements CalculatorService{

    public Integer sum(Integer num1, Integer num2) { return num1 + num2; }

    public  Integer subtract(Integer num1, Integer num2) { return num1 - num2; }

    public Integer multiply(Integer num1, Integer num2) { return num1 * num2; }

    public Integer divide(Integer num1, Integer num2) { return num1 / num2; }
}
