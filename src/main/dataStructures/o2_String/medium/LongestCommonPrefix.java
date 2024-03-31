package dataStructures.o2_String.medium;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix s = new LongestCommonPrefix();
        String[] strs = new String[]{"flower","flow","flight12"};

        Arrays.stream(strs).forEach(st -> System.out.println(st));
        String result = s.longestCommonPrefix(strs);
        System.out.println("Longest COmmon Substring is: " + result);
    }

    public String longestCommonPrefix(String[] strs) {

        StringBuilder subStr = new StringBuilder();

        int minLength = Arrays.stream(strs).map(s -> s.length()).sorted().findFirst().get();

        System.out.println("minLength: " + minLength);
        String firstELe = strs[0];

        for (int i =0; i< minLength; i++)
        {
            for (int j = 1; j < strs.length ; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i))
                    return subStr.toString();
            }
            subStr.append(strs[0].charAt(i));
        }
        return subStr.toString();

        /*int len = 0;
        if(a.length() < b.length())
            len = a.length();
        else
            len = b.length();

        StringBuilder sb = new StringBuilder();
        int i = len - 1;
        char carry = '0';
        while (i >=0 )
        {
            char sum = addBinary(addBinary(a.charAt(i), b.charAt(i)), carry);
            if (sum != 2) {
                sb.append(sum);
                carry = '0';
            }
            else {
                if (i == 0)
                    sb.append('0').append('1');
                else
                    sb.append('0');
                carry = '1';
            }
            i--;
        }
*/
    }
}
