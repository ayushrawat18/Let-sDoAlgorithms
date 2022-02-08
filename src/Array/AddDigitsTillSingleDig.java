package Array;

public class AddDigitsTillSingleDig {

    public static void  main(String args[]) {
        int num = addDigits(99);
        System.out.println(num);
    }

    private static int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num %10;
            num = num/10;

        }

        if (sum/10 ==0)
            return sum;

        return addDigits(sum);
    }
}
