package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayProduct {

    public static void main(String args[]) {
        int arr[] = new int[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int arrF[] =  productFinder(arr);
        int arrF[] =  arrayOfProducts(arr);
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

    public static int[] arrayOfProducts(int[] array) {

        int leftProduct = 1;
        int rightProduct = 1;
        int arrLP[] = new int[array.length];
        int arrRP[] = new int[array.length];
        int product[] = new int[array.length];

        for (int i=0; i< array.length; i++) {
            arrLP[i] = leftProduct;
            leftProduct = leftProduct * array[i];
        }

        for ( int i=array.length-1; i>= 0; i--) {
            arrRP[i] = rightProduct;
            rightProduct = rightProduct * array[i];
        }

        for(int i = 0; i< array.length; i++) {
            product[i] = arrLP[i] * arrRP[i];
        }

        return product;
    }

    
}
