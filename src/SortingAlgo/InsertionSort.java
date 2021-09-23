package SortingAlgo;

/**
 * Insertion sort
 */
public class InsertionSort {

        public static void main (String args[]) {
            int arr [] = new int[] {5,2,4,6,1,3,10,-1};

            _printArray("Intial Array ", arr);
            _insertionSort(arr);
        }

        public static void _insertionSort(int arr[]) {

            for (int i = 1; i < arr.length ; i++) {
               int j = i - 1;
               int key = arr[i];
               while (j >= 0 && key < arr[j]) {
                   int temp = arr[j];
                   arr[i] = temp;
                   j -- ;
               }
                arr[j+1] = key;
            }

            _printArray("After Sorting Array", arr);
        }

        public static void _printArray(String msg , int arr[]) {
            System.out.println(" "+msg+" : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
            }
        }
}
