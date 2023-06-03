package math;

import io.FileIO;

import java.util.ArrayList;
import java.util.List;


/**
 * The ArrayOperations class performs operations and search on arrays
 * @author  NikosNikolaidis02
 * @version 1.0
 * @since   2023-06-01
 */
public class ArrayOperations {

    /**
     * Finds the prime numbers from a file
     * @param fileIo object of the class FileIO
     * @param filepath the denominator of the operation
     * @param myMath the denominator of the operation
     * @return an array with prime numbers
     */
    public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
        System.out.println(1);
        List<Integer> finalArray = new ArrayList<>();
        System.out.println(1);
        int[] initial = fileIo.readFile(filepath);
        System.out.println(1);
        for (int i = 0 ; i < initial.length - 1; i++) {
            if (myMath.isPrime(initial[i])) {
                System.out.println(initial[i]);
                finalArray.add(initial[i]);
            }
        }

        return finalArray.stream().mapToInt(i -> i).toArray();
    }
}
