package ru.sky_pro.calculator.sky.pro_spring_calculator_demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDivideException extends IllegalArgumentException{

    public ZeroDivideException(){
        super("Ошибка деления на ноль");
    }
}
