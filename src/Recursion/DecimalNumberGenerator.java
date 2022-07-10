package Recursion;

import java.util.ArrayList;

public class DecimalNumberGenerator {

    public static void main(String[] args) {

        decimalNumbersGenerator(2, new ArrayList<String>());
    }

    private static void decimalNumbersGenerator(int digits, ArrayList<String> slate) {
        if (digits == 0) {
            System.out.println(slate);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            slate.add(i+"");
            decimalNumbersGenerator(digits-1, slate);
            slate.remove(slate.size()-1);
        }
    }
}
