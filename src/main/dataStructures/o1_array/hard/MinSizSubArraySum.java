package dataStructures.o1_array.hard;

import java.util.Arrays;

public class MinSizSubArraySum {
    public static void main(String[] args) {
        MinSizSubArraySum s = new MinSizSubArraySum();

        int[] nums = new int[] {1,1,1,1,1,1,1,1}; // {2,3,1,2,4,3}; //{2,7,11,15};
        int target = 11;// 7; //5;

        Arrays.stream(nums).forEach(n -> System.out.print(n + ","));
        System.out.println("Given Target: " + target);

        int result = s.minSubArrayLen(target, nums);

        //Arrays.stream(esults).forEach(n -> System.out.print(n + ","));
        System.out.println("result: " + result);

    }

    public int minSubArrayLen(int target, int[] nums) {
        int minSubArrLength = Integer.MAX_VALUE;
        int sum =0;
        int l =0;

        for (int r = 0; r < nums.length; r++) {
                sum = sum + nums[r];

                while (sum >= target){
                    minSubArrLength = Integer.min(minSubArrLength, (r - l) + 1);
                    sum = sum - nums[l];
                    l+= 1;
                }

        }
        if (minSubArrLength == Integer.MAX_VALUE)
            return 0;
        else
            return minSubArrLength;

    }
}
