package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayProduct {

    public static void main(String args[]) {
        Integer arr[] = new Integer[]{1,2,3,4,0};
        int arrF[] =  productFinder(arr);
        for (int i = 0; i < arrF.length; i++) {
            System.out.print(arrF[i] + " | ");
        }

    }

    public static int [] productFinder(Integer arr[]) {

        int arrF[] = new int[arr.length];
        int product = 1;
        List<Integer> marker = new ArrayList<>();

        for (int i=0; i <  arr.length ; i++) {
            if(arr[i] != 0) {
                product = product * arr[i];
            } else {
                marker.add(i);
            }
        }

        if(marker.isEmpty()) {
            for (int i = 0; i < arr.length; i++) {
                arrF[i] = product/arr[i];
            }
        } else {
            for (int i = 0; i < marker.size(); i++ ) {
                arrF[marker.get(i)] = product;
            }
        }
        return arrF;
    }

    
}
