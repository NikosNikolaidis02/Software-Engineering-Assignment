package math;

import io.FileIO;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperations {
    public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
        int[] initial;
        List<Integer> finalArray = new ArrayList<>();
        initial = fileIo.readFile(filepath);
        for (int i = 0 ; i < initial.length ; i++) {
            if (myMath.isPrime(initial[i])) {
                finalArray.add(initial[i]);
            }
        }

        return finalArray.stream().mapToInt(i -> i).toArray();
    }
}
