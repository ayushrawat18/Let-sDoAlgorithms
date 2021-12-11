package Array;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    public static void main(String args[]) {
        int array[] = new int[] {1,2,3,4,4,5,6,6,6,1,3};
        System.out.println(firstDuplicateValue(array));
    }


    public static int firstDuplicateValue(int[] array) {

        Set<Integer> s = new HashSet<>();
        for(int i=0; i<array.length; i++) {

            if(s.contains(array[i]))
                return array[i];
            else
                s.add(array[i]);
        }
        return -1;
    }

    public static int firstDuplicate(int [] array) {

        return 4;
    }
}
