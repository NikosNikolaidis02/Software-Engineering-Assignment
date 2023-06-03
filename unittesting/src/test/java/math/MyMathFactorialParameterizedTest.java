package math;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * The MyMathFactorialParameterizedTest class is a parameterized class for MyMathFactorial
 * @author  NikosNikolaidis02
 * @version 1.0
 * @since   2023-06-01
 */
@RunWith(Parameterized.class)
public class MyMathFactorialParameterizedTest {
    @Parameter (value = 0)
    public int n;
    @Parameter (value = 1)
    public int result;

    MyMath mathObj = new MyMath();

    /**
     * Setting parameters
     * @return a list of test values
     */
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{0,1},{1,1},{2,2},{12,479001600}};

        return Arrays.asList(data);
    }

    /**
     * Tests the factorial method for normal cases
     */
    @Test
    public void testFactorialNormalCases() {
        Assert.assertEquals(result, mathObj.factorial(n));
    }
}
