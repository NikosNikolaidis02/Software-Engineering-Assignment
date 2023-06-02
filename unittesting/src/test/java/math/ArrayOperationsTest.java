package math;

import io.FileIO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.Mockito;


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

    @Mock
    private FileIO fileIO;

    @Mock
    private MyMath myMath;

    @Before
    public void setUp() {
        fileIO = Mockito.mock(FileIO.class);
        myMath = Mockito.mock(MyMath.class);
    }

    /**
     * Tests the result of the function findPrimesInFile of the class Array Operations
     */
    @Test
    public void testFindPrimesInFile() {

        String resourcesPath = "unittesting/src/test/resources/";
        String filepath = resourcesPath + "primes.txt";
        int[] input = {2, 3, 4, 5, 6};
        int[] result = {2,3,5};

        Mockito.when(fileIO.readFile(filepath)).thenReturn(input);
        Mockito.when(myMath.isPrime(2)).thenReturn(true);
        Mockito.when(myMath.isPrime(3)).thenReturn(true);
        Mockito.when(myMath.isPrime(4)).thenReturn(false);
        Mockito.when(myMath.isPrime(5)).thenReturn(true);


        Assert.assertArrayEquals(result,arrayOperationsObj.findPrimesInFile(fileIO, filepath, myMath));
    }
}