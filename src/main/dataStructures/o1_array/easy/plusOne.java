package dataStructures.o1_array.easy;



import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        plusOne s = new plusOne();
        int[] nums = new int[]{9,8,7,6,5,4,3,2,1,0};
        int[] newNumArr = s.plusOne(nums);
        System.out.println("newNumArr: " + Arrays.toString(newNumArr));
    }

    public int[] plusOne(int[] digits) {

        String num = Arrays.toString(digits).replace(",","").replace(" ", "").replace("[", "").replace("]", "");

       /* Following logic will not work where input if a quite larger string, it fails on converting to int
       Long newNum = Long.parseLong(num) + 1;
        char[] charInts = Long.toString(newNum).toCharArray();
        System.out.println(Long.toString(newNum).toCharArray());

        int[] newNumArr = new int[charInts.length];
        for (int i=0; i<charInts.length; i++) {
            newNumArr[i] = charInts[i] - '0';
        }*/

        int l = digits.length-1;
        int sum = 0;
       for(int i = l; i >=0; i --)
       {
           sum = digits[i] + 1;

           if (sum <= 9)
           {
               digits[i] = sum;
               return digits;
           }
           digits[i] = 0;
       }
       int[] newArr = new int[l+2];
        newArr[0] = 1;
        return  newArr;
    }


}
