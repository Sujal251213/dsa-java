// Time: O(n) — every node visited exactly once
// Space: O(h) — recursion stack depth = height of tree
//               O(log n) for balanced tree, O(n) worst case (skewed tree)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode leftInverted = invertTree(root.left);
        TreeNode rightInverted = invertTree(root.right);

        root.left = rightInverted;
        root.right = leftInverted;

        return root;
    }
}