package ru.sky_pro.calculator.sky.pro_spring_calculator_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.processing.SupportedAnnotationTypes;

@Service

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) throws ZeroDivideException {

        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        return num1 / num2;
    }
}
