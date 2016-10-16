import static java.lang.Integer.max;

/**
 * Created by XiaochengWen on 16/10/16.
 */
public class MaximumDepthofBinaryTree {
    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
