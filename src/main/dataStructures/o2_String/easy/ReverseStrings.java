package dataStructures.o2_String.easy;

public class ReverseStrings {
    public static void main(String[] args) {
        ReverseStrings s = new ReverseStrings();
        String haystack = "a good   example"; // " sdad needle1 needle2 ";// "100";

        String revStr = s.reverseWords(haystack);
        System.out.println("haystack: " + "#" + haystack + "#");
        System.out.println("revStr: " + "#" + revStr + "#");
    }

    public String reverseWords(String s) {
        String[] origStr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int i = origStr.length -1;

        while (i >= 0){
            System.out.println("i: " + i + "#" + origStr[i] + "#");
            System.out.println("i: " + i + "#" + sb.toString() + "#");
            if(!origStr[i].trim().isEmpty())
                sb.append(origStr[i].trim());
            if(i != 0)
                sb.append(" ");
            i--;
        }

        return sb.toString().trim();



    }
}
