package dataStructures.string.medium;

public class binaryAddition {
    public static void main(String[] args) {
        binaryAddition s = new binaryAddition();
        String left = "11";// "100";
        String right = "1"; // "110";
        String st = s.getBinaryAddition(left, right);
        System.out.println("Left  Number: " + left);
        System.out.println("Right Number: " + right);
        System.out.println("Binary Addition: " + st);
    }

    private char addBinary(char a, char b) {
        if (a == '0' && b == '0')
            return '0';
        else if (a != b)
            return '1';
        else
            return '2';
    }

    public String getBinaryAddition(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() -1;
        int carry = 0;
        int sum = 0;

        while (i >= 0 || j >=0) {
            sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';

            sb.append(sum % 2);
            carry = sum / 2;

            i--; j--;
        }
        if (carry == 1)
            sb.append('1');
        return sb.reverse().toString();

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

