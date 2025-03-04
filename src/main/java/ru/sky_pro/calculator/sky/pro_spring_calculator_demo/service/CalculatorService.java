package ru.sky_pro.calculator.sky.pro_spring_calculator_demo.service;


public interface CalculatorService {
    Integer sum(Integer num1, Integer num2);

    Integer subtract(Integer num1, Integer num2);

    Integer multiply(Integer num1, Integer num2);

    Integer divide(Integer num1, Integer num2) throws ZeroDivideException;


}
