package dataStructures.o2_String.easy;


/*
 Reverse Words in a String III

Solution
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"


Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
 */


public class ReverseWordsIII {
    public static void main(String[] args) {
        ReverseWordsIII s = new ReverseWordsIII();
        String haystack = "Let's take LeetCode contest"; // " sdad needle1 needle2 ";// "100";

        String revStr = s.reverseWords(haystack);
        System.out.println("haystack: " + "#" + haystack + "#");
        System.out.println("revStr: " + "#" + revStr + "#");
    }

    public String reverseWords(String s) {
        String[] origStr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < origStr.length ; i++) {
            for (int j = origStr[i].length()-1; j >=0 ; j--) {
                sb.append(origStr[i].charAt(j));
            }
            if (i != origStr.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}



