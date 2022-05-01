package javacommons;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Examples {


    public static void main(String args[]) {

        //Convert integer to String
        Integer num = 900;
        String ans = String.valueOf(num);
        System.out.println(ans);

        //Convert String to integer
        String ex1 = "0123";
        System.out.println(Integer.valueOf(ex1));

        //intializing two diamensional array
        int arr[][] = new int[10][20];
        System.out.println(arr[0].length); // columns
        System.out.println(arr.length); // rows

        int arr2[] = new int[]{34, 454, 54}; // intialzing the elements of array

        int arr3[] = {34, 454, 54}; // intialzing the elements of array

        System.out.println("Two Dimensional ");
        //two dimensional array
        int fg[] [] = {{1,2,3},
                        {1,2,3},
                        {1,2,3},
                        {1,2,3}};

        for (int i=0; i<fg.length; i++) {
            System.out.println(fg[i][0]);
        }

        System.out.print("Sort a two dimensional array or arraylist ");
        //intervals - is 2d array

        Arrays.sort(fg, (a, b) -> Integer.compare(a[0], b[0]));

        
    }
}
