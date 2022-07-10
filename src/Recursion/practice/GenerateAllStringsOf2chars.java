package Recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllStringsOf2chars {
    public static void main(String[] args) {
        int n = 3; // digit numbers
        List<String> result = new ArrayList<>();
        generateAll2DigitNumbers(n, 0,"", result);
        System.out.println(result);
    }

    private static void generateAll2DigitNumbers(int n, int idx, String slate, List<String> result) {
        if (n == 0) {
            result.add(slate);
            return;
        }


        long j = 90;
        long l = (long)Character.getNumericValue('c');
        for (int i=idx; i<=3; i++) {
            generateAll2DigitNumbers(n-1, idx+1, slate+i, result);
        }
    }
}
