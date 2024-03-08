package dataStructures.string.easy;

public class needleInHaystack {
    public static void main(String[] args) {
        needleInHaystack s = new needleInHaystack();
        String haystack = "sdad needle needle";// "100";
        String needle = "needle"; // "110";
        int idx = s.strStr(haystack, needle);
        System.out.println("haystack: " + haystack);
        System.out.println("needle: " + needle);
        System.out.println("idx: " + idx);
    }

    public int strStr(String haystack, String needle) {
        int idx = haystack.indexOf(needle);

        return idx;

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

