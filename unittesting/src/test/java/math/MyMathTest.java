package math;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
/**
 * This Test Java file target to create a set of test cases in order to test the Java class MyMath and the factorial
 * function
 *
 * @author NikosNikolaidis02
 * @version 1.0
 * @since 2023-05-22
 */
public class MyMathTest {

    MyMath mathObj = new MyMath();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_checkNegative () {
        thrown.expectMessage("The value is higher than 12 or lower than 0");
        mathObj.factorial(-1);
    }

    @Test
    public void test_checkOverTwelve () {
        thrown.expectMessage("The value is higher than 12 or lower than 0");
        mathObj.factorial(14);
    }

    @Test
    public void test_checkPrimeLowerThanTwo () {
        thrown.expectMessage("The input value should be greater or equal than 2");
        mathObj.isPrime(1);
    }

    @Test
    public void test_checkPrime () {
        Assert.assertEquals(true, mathObj.isPrime(3));
    }
}
