package Recursion;

public class Power {

    static int mod = 1000000007;

    public static void main(String args[]) {
        Long a = 455454544L;
        Long b = 545454545L;
        System.out.println(calculatePower(a, b));
    }

    private static Integer calculatePower(Long a, Long b) {

        if (a == 0)
            return 0;
        else if(a == 1 || b ==0)
            return 1;
        else {
            return (int) helperCalculate(a%mod, b);
        }
    }

    private static long helperCalculate(Long a, Long b) {
        if(b == 1)
            return a%mod;
        else {
            long sq = a*a%mod;
            long result = sq;
        }

        return 0l;
    }
}
