/**
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
Hide Tags Array
*/

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        if (numRows <= 0) return res;
        int[] buff = new int[numRows + 1];
        buff[1] = 1;
        for (int i = 0; i < numRows; i++) {
            LinkedList<Integer> elem = new LinkedList<>();
            for (int j = i; j >= 0; j--) {
                buff[j + 1] = buff[j] + buff[j + 1];
                elem.addFirst(buff[j + 1]);
            }
            res.add(elem);
        }
        return res;
    }
}