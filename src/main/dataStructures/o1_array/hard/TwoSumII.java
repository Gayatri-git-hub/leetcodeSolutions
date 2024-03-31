package dataStructures.o1_array.hard;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        TwoSumII s = new TwoSumII();

        int[] nums = new int[] {-1,0}; //{2,7,11,15};
        int target = -1; //5;

        Arrays.stream(nums).forEach(n -> System.out.print(n + ","));
        System.out.println("Given Target: " + target);

        int[] results = s.twoSum(nums, target);

        Arrays.stream(results).forEach(n -> System.out.print(n + ","));

    }

    public int[] twoSum(int[] numbers, int target) {

        int sum =0;
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                sum = numbers[i] + numbers[j];
                if (sum > target)
                    break;
               // System.out.println("Sum of index i: " + i + " and j: " + j + " = " + sum);
                if (sum == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                    }
                }
            }
        return result;

    }
}
