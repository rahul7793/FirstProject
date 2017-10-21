/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private static int min;
    private static TreeNode temp;
    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        
        Solution.inOrder(root);
        
        return min;
    }
    
    public static void inOrder(TreeNode nroot){
        if(nroot == null)
            return;
        inOrder(nroot.left);
        if(temp != null){
            min = Math.min(min, Math.abs(nroot.val - temp.val));
        }
        temp  = nroot;
        inOrder(nroot.right);
    }
}
