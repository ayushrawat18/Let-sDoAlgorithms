package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {



    public static void main(String args[]) {
      //  List<Object> obj = new ArrayList<>(Arrays.asList([1]));


    }
    public static int productSum(List<Object> array) {

        int depth = 1;
        int sum = 0;
        return productSum (array, depth);

    }

    private static int productSum (List<Object> array, int depth) {

        int sum = 0;
        for(int i=0; i<array.size(); i++) {

            if(array.get(i) instanceof ArrayList) {
                ArrayList<Object> ls = (ArrayList<Object>) array.get(i);
                productSum(ls, depth+1);
                depth = depth - 1;
            } else
                sum = sum + (int)array.get(i);
        }

        return sum*depth;
    }
}
