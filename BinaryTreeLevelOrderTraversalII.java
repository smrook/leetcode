/**
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

Hide Tags Tree Breadth-first Search

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

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<TreeNode> buff = new LinkedList<>();
            List<Integer> elem = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                elem.add(node.val);
                if (node.left != null) buff.add(node.left);
                if (node.right != null) buff.add(node.right);
            }
            res.add(elem);
            for (TreeNode node : buff) queue.offer(node);
        }
        Collections.reverse(res);
        return res;
    }
}