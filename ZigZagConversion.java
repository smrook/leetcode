/**
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
Hide Tags String
*/

public class ZigZagConversion {
    public String convert(String s, int nRows) {
        if (s == null || nRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nRows; i++) {
            if (i == 0 || i == nRows - 1) {
                for (int k = i; k < s.length(); k += nRows * 2 - 2)
                    sb.append(s.charAt(k));
                continue;
            }
            int m = i, n = 2 * (nRows - i - 1);
            while (m < s.length()) {
                sb.append(s.charAt(m));
                if ((m + n) < s.length()) sb.append(s.charAt(m + n));
                m += nRows * 2 - 2;
            }
        }
        return sb.toString();
    }
}