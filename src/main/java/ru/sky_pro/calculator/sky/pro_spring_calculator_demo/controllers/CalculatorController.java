package ru.sky_pro.calculator.sky.pro_spring_calculator_demo.controllers;

public class CalculatorController {

    private final ru.sky_pro.calculator.sky.pro_spring_calculator_demo.controllers.CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    public String showGreetings() {
        return "<h1>Добро пожаловать в калькулятор.</h1>";
    }


    public String sumNumbers( Integer num1,  Integer num2) {
        Integer result = calculatorService.sum(num1, num2);
        return generateMessage(num1, num2, '+', result);
    }


    public String subtractNumbers( Integer num1,  Integer num2) {
        int result = calculatorService.subtract(num1, num2);
        return generateMessage(num1, num2, '-', result);
    }


    public String multiplyNumbers( Integer num1,  Integer num2) {
        int result = calculatorService.multiply(num1, num2);
        return generateMessage(num1, num2, '*', result);
    }


    public String divideNumbers( Integer num1, Integer num2) {
        if (num2 == 0) {

            throw new IllegalArgumentException("mistake");
        }

        int result = calculatorService.divide(num1, num2);
        return generateMessage(num1, num2, '/', result);
    }

    private String generateMessage(Integer num1, Integer num2, char action, int result) {
        return String.format("<h1>%d %c %d = %d</h1>", num1, action, num2, result);
    }
}