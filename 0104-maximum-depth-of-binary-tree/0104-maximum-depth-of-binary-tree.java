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
    int max=0;
    public int helper(TreeNode root, int ans){
        if(root == null)
            return max;
        ans+=1;
        if(ans > max)
            max = ans;
        
        helper(root.left,ans);
        helper(root.right,ans);

        return max;
    }
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        return helper(root,0);
    }
}