/**
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".

Hide Tags Math String
*/

public class AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) sb.append("1");
        return sb.reverse().toString();
    }
}