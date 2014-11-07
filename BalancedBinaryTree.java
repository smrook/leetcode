/**
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

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

import java.util.concurrent.atomic.AtomicInteger;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return isBalanced(root, new AtomicInteger());
    }

    private boolean isBalanced(TreeNode node, AtomicInteger height) {
        if (node == null) {
            height.set(0);
            return true;
        }
        AtomicInteger leftHeight = new AtomicInteger();
        boolean leftBal = isBalanced(node.left, leftHeight);
        AtomicInteger rightHeight = new AtomicInteger();
        boolean rightBal = isBalanced(node.right, rightHeight);
        if (!leftBal || !rightBal) return false;
        if (Math.abs(leftHeight.intValue() - rightHeight.intValue()) > 1) return false;
        height.set((leftHeight.intValue() > rightHeight.intValue() ? leftHeight.intValue() : rightHeight.intValue()) + 1);
        return true;
    }
}