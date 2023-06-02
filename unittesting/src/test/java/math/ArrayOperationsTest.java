package math;

import io.FileIO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import java.io.File;

import static org.mockito.Mockito.mock;

/**
 * The ArrayOperations is a test class for Array Operations
 * @author  NikosNikolaidis02
 * @version 1.0
 * @since   2023-06-01
 */
public class ArrayOperationsTest {

    ArrayOperations arrayOperationsObj = new ArrayOperations();


    /**
     * Tests the result of the function findPrimesInFile of the class Array Operations
     */
    @Test
    public void testFindPrimesInFile() {
        MyMath myMathObj = mock(MyMath.class);
        FileIO fileIO = mock(FileIO.class);

        String resourcesPath = "unittesting/src/test/resources/";
        String filepath = resourcesPath + "primes.txt";

        int[] result = new int[]{2,3,5};

        //Assert.assertArrayEquals(result,arrayOperationsObj.findPrimesInFile(fileIO, filepath, myMathObj));
    }
}