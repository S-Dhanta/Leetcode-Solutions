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
    public void helper(TreeNode root, String path, List<String> list){
        if(root==null){
            return;
        }
        if(root.left == null && root.right == null){
            if(path ==  ""){
                path=path+Integer.toString(root.val);
            }
            else{
                path=path+"->"+Integer.toString(root.val);
            }
            list.add(path);
            return;
        }
        if(path ==  ""){
            path=path+Integer.toString(root.val);
        }
        else{
            path=path+"->"+Integer.toString(root.val);
        }
        
        helper(root.left,path,list);
        helper(root.right,path,list);
        
        return;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        String path="";
        List<String> list = new ArrayList<>();
        path+=Integer.toString(root.val);
        if(root.left == null && root.right == null){
            list.add(path);
            return list;
        }
        path="";
        helper(root, path, list);
        
        return list;
    }
}