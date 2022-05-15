package Array.partition;

import commons.Commons;

import java.util.Arrays;

public class PolishNationalFlag {

    /**
     * Need to do partitioning via
     * G-R
     * @param args
     */
    public static void main(String args[]) {
        String color[] = {"R", "R", "G", "R", "G", "R", "R", "R"};

        int greenIdx = 0;

        for (int i = 0; i < color.length; i++) {

            if (color[i] == "G") {
                swap(greenIdx, i, color);
                greenIdx++;
            }
        }

        System.out.println(greenIdx);
        System.out.println(Arrays.asList(color));
    }

    private static void swap(int idx1, int idx2, String[] color) {
        String temp = color[idx1];
        color[idx1] = color[idx2];
        color[idx2] = temp;
    }


}
