package math;

import io.FileIO;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperations {
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
