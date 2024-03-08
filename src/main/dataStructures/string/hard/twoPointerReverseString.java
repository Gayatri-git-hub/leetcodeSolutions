package dataStructures.string.hard;

import java.util.Arrays;

public class twoPointerReverseString {
    public static void main(String[] args) {
        twoPointerReverseString s = new twoPointerReverseString();
        char[] str = new char[]{'h','e','l','l','o'};
        //Arrays.stream(str).forEach(s1 -> System.out.println(s1));
        s.reverseString(str);
        System.out.println("str: " + str);

    }

    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

        while (i < j){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;

            i++;
            j--;
        }

        System.out.println("Reveresed String: " + s);
    }
}

