/**
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Hide Tags Math String
*/

/*
{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
{"", "M", "MM", "MMM"}
*/

public class RomanToInteger {
    
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    res += 1000;
                    if (i > 0 && s.charAt(i - 1) == 'C') res -= 200;
                    break;
                case 'C':
                    res += 100;
                    if (i > 0 && s.charAt(i - 1) == 'X') res -= 20;
                    break;
                case 'D':
                    res += 500;
                    if (i > 0 && s.charAt(i - 1) == 'C') res -= 200;
                    break;
                case 'X':
                    res += 10;
                    if (i > 0 && s.charAt(i - 1) == 'I') res -= 2;
                    break;
                case 'L':
                    res += 50;
                    if (i > 0 && s.charAt(i - 1) == 'X') res -= 20;
                    break;
                case 'I':
                    res += 1;
                    break;
                case 'V':
                    res += 5;
                    if (i > 0 && s.charAt(i - 1) == 'I') res -= 2;
            }
        }
        return res;
    }
}