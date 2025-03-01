package ru.sky_pro.calculator.sky.pro_spring_calculator_demo.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class ZeroDivideException extends RuntimeException {

    public ZeroDivideException(){
        super("Ошибка деление на ноль");
    }
}
