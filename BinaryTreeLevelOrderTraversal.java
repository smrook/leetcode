/**
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

Hide Tags Tree Breadth-first Search
*/

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
        return res;
    }
}