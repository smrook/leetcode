/**
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

Hide Tags Array Math
*/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return null;
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry == 0) break;
            int sum = carry + digits[i];
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 0) return digits;
        int[] res = new int[digits.length + 1];
        res[0] = carry;
        for (int i = 0; i < digits.length; i++) {
            res[i+1] = digits[i];
        }
        return res;
    }
}