package io;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

/**
 * This Test Java file target to create a set of test cases in order to test the Java class FileIO
 *
 * @author NikosNikolaidis02
 * @version 1.0
 * @since 2023-05-21
 */

public class FileIOTest {

    FileIO obj = new FileIO();

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    /**
     * Tests the case the user gives a missing file as an input on the method readFile in class FileIO
     */
    @Test
    public void test_checkMissingFile () {
        thrown.expectMessage("Input file does not exist");
        obj.readFile( "src/test/resources/" + "error.txt");
    }

    /**
     * Tests the case the users gives an empty file as an input on the method readFile in class FileIO
     */
    @Test
    public void test_checkEmptyFile () {
        thrown.expectMessage("Given file is empty");
        obj.readFile("src/test/resources/" +"empty.txt");
    }

    /**
     * Tests the output of readfile of the class FileIO
     */
    @Test
    public void test_FunctionReadFile() {
        int[] array = new int[]{1, 4, 5, 5, 6, 7, 2, 9};
        Assert.assertArrayEquals(array, obj.readFile("src/test/resources/" +"numbers.txt"));
    }

    /**
     * Tests the case the users gives an file as an input on the method readFile in class FileIO that has wrong values
     * (eg. "text")
     */
    @Test
    public void testReadFileContainsInvalidEntries() {
        try {
            obj.readFile("src/test/resources/" +"wrong.txt");
            Assert.fail("Exception not throwned");
        } catch (Exception e) {
            Assert.assertEquals("Wrong Input values", e.getMessage());
        }
    }

}
