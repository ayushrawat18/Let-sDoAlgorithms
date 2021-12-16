package Array;

import java.util.Arrays;

public class NonConstrutibleChange {

    public static void main(String args[]) {

        int array[] = new int[]{76,1,1,4,3};
        System.out.println(findNonConstructibleChange(array));

    }


    public static int findNonConstructibleChange(int array[]) {

        Arrays.sort(array);
        int change = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > change)
                return change;

            change+=array[i];
        }
        return change;
    }
}
