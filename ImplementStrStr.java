/**
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Update (2014-11-02):
The signature of the function had been updated to return the index instead of the pointer. If you still see your function signature returns a char * or String, please click the reload button  to reset your code definition.

Hide Tags Two Pointers String
*/

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length()) return -1;
        if (needle.isEmpty()) return 0;
        for (int i = 0; i <= haystack.length() - needle.length();) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                i++;
                continue;
            }
            int next = 0, j = 1;
            boolean match = true;
            while (j < needle.length()) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
                if (next == 0 && haystack.charAt(i + j) == needle.charAt(0)) next = j;
                j++;
            }
            if (match) return i;
            i += next == 0 ? j : next;
        }
        return -1;
    }
}