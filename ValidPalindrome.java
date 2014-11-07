/**
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

Hide Tags Two Pointers String
*/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.trim().isEmpty()) return true;
        s = s.trim().toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i), right = s.charAt(j);
            if ((left < 'a' || left > 'z') && (left < '0' || left > '9')) i++;
            else if ((right < 'a' || right > 'z') && (right < '0' || right > '9')) j--;
            else if (left != right) return false;
            else { i++; j--; }
        }
        return true;
    }
}