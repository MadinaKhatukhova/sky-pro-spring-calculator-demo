package ru.sky_pro.calculator.sky.pro_spring_calculator_demo;


import org.junit.jupiter.api.Test;
import ru.sky_pro.calculator.sky.pro_spring_calculator_demo.service.CalculatorService;
import ru.sky_pro.calculator.sky.pro_spring_calculator_demo.service.CalculatorServiceImpl;

import static java.lang.System.out;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
import static ru.sky_pro.calculator.sky.pro_spring_calculator_demo.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {

    private final CalculatorService qut = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1And2() {assertEquals(THREE, out.sum(ONE, TWO)); }

    @Test
    public void shouldReturn2WhenSum0And2() {

        assertEquals(TWO, out.sum(ZERO));
    }

    private void assertEquals(Integer two, boolean equals) {
    }

    @Test
    public void shouldReturn0WhenSubtract2And2() {assertEquals(ZERO, out.subtract(TWO, TWO)); }

    @Test
    public void shouldReturn1WhenSubtract2And1() { assertEquals(ONE, out.subtract(TWO, ONE)); }

    @Test
    public void shouldReturn1WhenMultiply1And1() { assertEquals(ONE, out.multiply (ONE, ONE)); }

    @Test
    public void shouldReturn2WhenMultiply2And1() { assertEquals(TWO, out.multiply(TWO, ONE)); }

    @Test
    public void shouldReturn1WhenDivide2And2() { assertEquals(ONE, out.divide(TWO, TWO)); }



}