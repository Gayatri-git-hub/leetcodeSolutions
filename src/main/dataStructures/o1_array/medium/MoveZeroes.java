package dataStructures.o1_array.medium;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes s = new MoveZeroes();

        int[] nums = new int[]{0,1,0,3,12};

        System.out.println("Given Array: ");
        Arrays.stream(nums).forEach(n -> System.out.print(n + ","));
        System.out.println("\n Expected Array: [1,3,12,0,0]");
        s.moveZeroes(nums);
        System.out.println("New Derived Array: ");
        Arrays.stream(nums).forEach(n -> System.out.print(n + ","));

    }

    public void moveZeroes(int[] nums) {
        int idx =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[idx] = nums[i];
                idx++;
            }
        }

        for (int i = idx; i < nums.length; i++) {
            nums[i] = 0;
        }
       return;

    }
}
