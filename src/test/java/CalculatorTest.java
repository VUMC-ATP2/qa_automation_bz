import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();//taisa jaunu obj. no main klases;
        calculator.sum(10.00, 25.00);//padod mainīgos
        Assert.assertEquals(calculator.sum(10.00, 25.00), 35.00);//
        //calculator.sum(10.00, 25.00) ir tas, ko reāli ievadu+metode no main klases un sagaidu summu, expected=cik jābūt; un vai abi sakrīt
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        calculator.sum(18.00, 12.00);
        Assert.assertEquals(calculator.subtract(18.00, 12.00), 6.00);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        calculator.divide(12.00, 4.00);
        Assert.assertEquals(calculator.divide(12.00, 4.00), 3.00, "Incorrec! Please check!");
        //ja ieraksta komatu un "", ir iespēja pievienot ziņu kļūdas gadījumā
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        calculator.mulitply(10.00, 7.00);
        Assert.assertEquals(calculator.mulitply(10.00, 7.00), 70.00);
    }

}
