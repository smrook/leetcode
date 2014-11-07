/**
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?

Hide Tags Array
*/

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new LinkedList<>();
        if (rowIndex < 0) return res;
        int[] buff = new int[rowIndex + 2];
        buff[1] = 1;
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j>= 0; j--) {
                buff[j+1] += buff[j];
            }
        }
        for (int i = 0; i <= rowIndex; i++) {
            res.add(buff[i+1]);
        }
        return res;
    }
}