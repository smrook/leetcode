/**
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.

Hide Tags String
*/

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        int len = 0;
        for (char c : s.trim().toCharArray()) {
            if (c == ' ') len = 0;
            else len++;
        }
        return len;
    }
}