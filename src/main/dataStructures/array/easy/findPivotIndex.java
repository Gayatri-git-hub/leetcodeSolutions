package dataStructures.array.easy;


import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{-1,-1,0,1,1,0};
        s.pivotIndex(nums);
    }
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];

        for (int i = 0; i<= nums.length-1 ; i++){
            if (i == 0)
                sumLeft[i] = 0;
            else
            {
                for (int j = 0; j < i; j++)
                    sumLeft[i] += nums[j];
            }

            if (i == nums.length-1)
                sumRight[i] = 0;
            else {
                for (int j = i+1; j <= nums.length-1; j++)
                    sumRight[i] += nums[j];
            }

            if (sumLeft[i] == sumRight[i])
                return i;
        }
        Arrays.stream(sumLeft).forEach(n -> System.out.print(n + ","));
        System.out.println();
        Arrays.stream(nums).forEach(n -> System.out.print(n+ ","));
        System.out.println();
        Arrays.stream(sumRight).forEach(n -> System.out.print(n+ ","));

        return -1;
    }
}