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
    @Test
    public void test_DivideWithNonZeroDenominator() {
        double result = arithmeticObject.divide(100.0,10.0);
        Assert.assertEquals(10.0, result, 0.0);

    }

    @Test (expected = ArithmeticException.class)
    public void test_DivideWithZeroDenominator() {
        /*try {
            arithmeticObject.divide(1.0, 0.0);
            Assert.fail("Exception not thrown for deviation with zero denominator");
        } catch (ArithmeticException e) {
            Assert.assertEquals("Cannot divide with zero", e.getMessage());
        }*/
        arithmeticObject.divide(1.0, 0.0);

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_checkNegativeX () {
        thrown.expectMessage("x & y should be >= 0");
        arithmeticObject.multiply(-1 , 2);
    }

    @Test
    public void test_checkNegativeY () {
        thrown.expectMessage("x & y should be >= 0");
        arithmeticObject.multiply(1 , -2);
    }

    @Test
    public void test_checkBothNegative () {
        thrown.expectMessage("x & y should be >= 0");
        arithmeticObject.multiply(-1 , -2);
    }

    @Test
    public void test_Multiply() {
        Assert.assertEquals(15, arithmeticObject.multiply(3,5));
    }

    @Test
    public void test_multiplyElse() {
        thrown.expectMessage("The product does not fit in an Integer variable");
        arithmeticObject.multiply(99999*99999 , 999999999*9999999);
    }
}
