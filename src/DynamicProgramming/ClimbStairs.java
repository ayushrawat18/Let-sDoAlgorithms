package DynamicProgramming;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbStairs {
    public static void main(String args[]) {
        int stairs = 3;
        int dp[] = new int[stairs + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= stairs; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[dp.length-1]);
    }

}
