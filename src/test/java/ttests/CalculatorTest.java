package ttests;

import org.junit.Assert;
import org.junit.Test;
import task1.Calculator;

public class CalculatorTest {


    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        Assert.assertEquals("Add is not correct", 0, calculator.add(-5,5));
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals("Subtract is not correct", 8, calculator.subtract(16,8));
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals("Multiply is not correct", 10, calculator.multiply(2,5));
    }

    @Test
    public void divideTest() {
        Assert.assertEquals("Divide is not correct", 7, calculator.divide(49,7));
    }

    @Test (expected = ArithmeticException.class)
    public void divideTest1() {
        Assert.assertEquals("Division by zero is not possible", calculator.divide(49,0));
    }
}
