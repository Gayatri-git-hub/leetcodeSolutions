package dataStructures.array.hard;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        RemoveElements s = new RemoveElements();

        int[] nums = new int[] {3,2,2,3}; //{2,7,11,15};
        int target = 3; //5;

        Arrays.stream(nums).forEach(n -> System.out.print(n + ","));
        System.out.println("Given Target: " + target);

        int result = s.removeElement(nums, target);

        System.out.println("result: " + result);

    }

    public int removeElement(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
            {
                nums[k++] = nums[i];
            }
        }

        return k;

    }
}
