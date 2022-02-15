package BitManuplation;

public class FindUnique {

    public static void main(String args[]) {
        int unique = findUnique(new int[]{90,1,2,3,1,2,3});
        System.out.println(unique);
    }

    /**
     * Learning : XOR of 0 and Num = Num
     * XOR of Num and Num = 0
     * @param arr
     * @return
     */
    public static int findUnique(int arr[]) {

        int xor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
