
package ru.sky_pro.calculator.sky.pro_spring_calculator_demo.service;
import org.springframework.stereotype.Service;
import ru.sky_pro.calculator.sky.pro_spring_calculator_demo.exception.ZeroDivideException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public  Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num2==0) {
            throw new ZeroDivideException();
        }
        return num1 / num2;
    }


}
