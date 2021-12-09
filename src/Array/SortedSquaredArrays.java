package Array;

public class SortedSquaredArrays {


    public static void main(String args[]) {

        int arr [] = new int[] {-9, 1, 2};
        int sortedArr[] = sortedSquaredArrays(arr);

        for (int i=0; i<sortedArr.length; i++)
            System.out.print(sortedArr[i] + " ");

    }

    /*
        Array is sorted
     */
    public static int[] sortedSquaredArrays(int array[]) {

        int smallerIdx = 0;
        int largerIdx = array.length - 1;
        int sortedArr[] = new int[array.length];

        for (int i = 0 ; i < array.length; i ++) {
            int smallerValue = array[smallerIdx];
            int largerValue = array[largerIdx];

            if(Math.abs(largerValue) > Math.abs(smallerValue)) {
                sortedArr[i] = smallerValue * smallerValue;
                largerIdx --;
            }
            else {
                sortedArr[i] = largerValue * largerValue;
                smallerIdx ++;
            }

        }
        return  sortedArr;
    }
}
