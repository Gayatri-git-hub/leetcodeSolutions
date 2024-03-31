package dataStructures.o1_array.easy;

import java.util.Arrays;

public class largestNumAtLeastTwiceEach {
    public static void main(String[] args) {
        largestNumAtLeastTwiceEach s = new largestNumAtLeastTwiceEach();
        int[] nums = new int[]{3,6,1,0};
        int ind = s.dominantIndex(nums);
        System.out.println("Largest Num Index: " + ind);
    }

    public int dominantIndex(int[] nums) {
        int largestNum = Arrays.stream(nums).max().getAsInt();
        int largeNumInd = -1 ;
        for (int i=0; i < nums.length; i++)
        {
            if (nums[i] == largestNum)
                largeNumInd = i;
            else if(nums[i] * 2 > largestNum)
                return -1;
        }
        return largeNumInd;

    }
}
