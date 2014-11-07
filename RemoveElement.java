/**
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Hide Tags Array Two Pointers
*/

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        if (A == null) return 0;
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) A[res++] = A[i];
        }
        return res;
    }
}