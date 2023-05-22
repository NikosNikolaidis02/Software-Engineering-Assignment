package math;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import io.FileIO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


import static org.mockito.Mockito.mock;

public class ArrayOperationsTest {

    private MyMath myMathObj;
    private FileIO fileIO;

    @Before
    public void setup() {
        myMathObj = mock(MyMath.class);
        fileIO = mock(FileIO.class);
    }

    ArrayOperations arrayOperationsObj = new ArrayOperations();

    @Test
    public void testFindPrimesInFile() {
        String filepath = "src/test/resources/primes.txt";
        int[] result = new int[]{2,3,5};
        Assert.assertEquals(result,arrayOperationsObj.findPrimesInFile(fileIO, filepath, myMathObj));
    }

}
