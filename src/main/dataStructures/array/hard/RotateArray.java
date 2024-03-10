package dataStructures.array.hard;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray s = new RotateArray();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        //5,6,7,1,2,3,4
        int k = 3;           //      k,

        System.out.println("Given Array: ");
        Arrays.stream(nums).forEach(n -> System.out.print(n + ","));


        s.rotate(nums, k);

        System.out.println("Modified Array: ");
        Arrays.stream(nums).forEach(n -> System.out.print(n + ","));

    }

    public void rotate(int[] nums, int k) {
        int[] origNums = nums.clone();
        int l = nums.length;

        if(k == 0)
            return;

        int steps = (k/l) + 1;

        for (int j = 0; j <= steps; j++) {
            int k1 = 0;
            if(k > l) {
                k1 = l;
                k = k - l;
            }
            else
                k1 = k;
            for (int i = 0; i < l; i++) {
                if (i < k1)
                    nums[i] = origNums[(l - k1 + i)];
                else
                    nums[i] = origNums[(i - k1)];
                System.out.print(nums[i]);
            }
        }
        return;

    }
}
