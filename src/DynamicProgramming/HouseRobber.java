package DynamicProgramming;

public class HouseRobber {

    public static void main(String args[]) {

        System.out.println(rob(new int[]{2,1,1,2}));
    }

    public static int rob(int[] nums) {

        //int dp[] = new int[nums.length];
        int sumOdd=0, sumEven=0;
        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0)
                sumEven = Math.max(sumEven + nums[i], sumOdd);
            else
                sumOdd = Math.max(nums[i]+ sumOdd, sumEven) ;
        }

        return Math.max(sumOdd, sumEven);
    }

}

