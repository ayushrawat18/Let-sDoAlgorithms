package commons;

import java.util.List;

public class Commons {

    public static void swap(int index1, int index2, int[] arr) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printArray(int sortedArray[]) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(" "+sortedArray[i]+" ");
        }
    }


    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" "+list.get(i)+" ");
        }
    }
}
