/**
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

Hide Tags Tree Depth-first Search
*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SymmetricTree {
	public boolean isSymmetric_1(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (queue.size() > 1) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null ^ right == null) return false;
            if (left == right) continue;
            if (left.val != right.val) return false;
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }

    public boolean isSymmetric_2(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }
    
    private boolean isSymmetricRecursive(TreeNode left, TreeNode right) {
        if (left == null ^ right == null) return false;
        if (left == null || right == null) return true;
        return left.val == right.val && isSymmetric(left.left, right.right)
        	&& isSymmetric(left.right, right.left);
    }
}