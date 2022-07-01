package mavenTestNGHomework;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeSuite
    public void executeBefore() {
        this.calculator = new Calculator();
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println("Test has started!");
    }

    @Test
    public void testSum() {
        calculator.add(10, 25);
        Assert.assertEquals(calculator.add(10, 25), 35);
    }

    @Test
    public void testSubtract() {
        calculator.substract(18, 12);
        Assert.assertEquals(calculator.substract(18, 12), 6.);
    }

    @Test
    public void testMultiply() {
        calculator.multiply(10, 7);
        Assert.assertEquals(calculator.multiply(10, 7), 70);
    }

    @Test
    public void testDivide() {
        calculator.divide(12, 4);
        Assert.assertEquals(calculator.divide(12, 4), 3);
    }
}
