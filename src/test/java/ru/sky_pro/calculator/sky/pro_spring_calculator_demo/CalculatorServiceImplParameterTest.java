package ru.sky_pro.calculator.sky.pro_spring_calculator_demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.sky_pro.calculator.sky.pro_spring_calculator_demo.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
import static ru.sky_pro.calculator.sky.pro_spring_calculator_demo.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParameterTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSubtraction(int num1, int num2) {
        assertEquals(num1-num2, out.subtract(num1,num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiplication(int num1, int num2) {
        assertEquals(num1+num2, out.multiply(num1,num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivision(int num1, int num2) {
        assertEquals(num1 / num2, out.divide(num1,num2));
    }

    private void assertEquals(int i, Integer divide) {
    }

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ZERO, TWO),
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, ONE)

        );
    }

}