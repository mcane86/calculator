package io.michaelcane;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorSpec {

    @Test
    public void sumTest() {
        io.michaelcane.Calculator calculator = new io.michaelcane.Calculator();
        int expectedSum = 4;
        int actualSum = calculator.sum(2, 2);
        assertEquals("the expected value should be 4", expectedSum, actualSum);
    }

    @Test
    public void divTest() {
        Calculator calculator = new Calculator();
        float expectedSum = 2;
        float actualSum = calculator.divide(10f, 5f);
        float delta = 0.0f;
        assertEquals("the expected value should be 2", expectedSum, actualSum, delta);
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        double expectedSum = 50;
        double actualSum = calculator.subtract(100, 50);
        double delta = 0.0;
        assertEquals("the expected value should be 50", expectedSum, actualSum, delta);
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        double expectedSum = 300;
        double actualSum = calculator.multiply(150, 2);
        double delta = 0.0;
        assertEquals("the expected value should be 300", expectedSum, actualSum, delta);
    }
}



