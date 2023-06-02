package math;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

/**
 * This Test Java file target to create a set of test cases in order to test the Java class ArithmeticOperations and
 * its functions
 *
 * @author NikosNikolaidis02
 * @version 1.0
 * @since 2023-05-21
 */

public class ArithmeticOperationsTest {

    ArithmeticOperations arithmeticObject = new ArithmeticOperations();

    /**
     * Tests the case the user gives non-zero both numerator and denominator
     */
    @Test
    public void test_DivideWithNonZeroDenominator() {
        double result = arithmeticObject.divide(100.0,10.0);
        Assert.assertEquals(10.0, result, 0.0);

    }

    /**
     * Tests the case the user gives zero denominator of the function multiply
     */
    @Test (expected = ArithmeticException.class)
    public void test_DivideWithZeroDenominator() {
        arithmeticObject.divide(1.0, 0.0);

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Tests the case the user gives negative x of the function multiply
     */
    @Test
    public void test_checkNegativeX () {
        thrown.expectMessage("x & y should be >= 0");
        arithmeticObject.multiply(-1 , 2);
    }

    /**
     * Tests the case the user gives negative y of the function multiply
     */
    @Test
    public void test_checkNegativeY () {
        thrown.expectMessage("x & y should be >= 0");
        arithmeticObject.multiply(1 , -2);
    }

    /**
     * Tests the case the user gives negative both x and y of the function multiply
     */
    @Test
    public void test_checkBothNegative () {
        thrown.expectMessage("x & y should be >= 0");
        arithmeticObject.multiply(-1 , -2);
    }

    /**
     * Tests the result of the function multiply
     */
    @Test
    public void test_Multiply() {
        Assert.assertEquals(15, arithmeticObject.multiply(3,5));
    }

    /**
     * Tests the result of the function in case the input variable does not fit in an integer
     */
    @Test
    public void test_multiplyElse() {
        thrown.expectMessage("The product does not fit in an Integer variable");
        arithmeticObject.multiply(99999*99999 , 999999999*9999999);
    }
}
