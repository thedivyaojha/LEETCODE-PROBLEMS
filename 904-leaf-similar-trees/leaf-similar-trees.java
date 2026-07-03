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
    public void trav(TreeNode root ,ArrayList<Integer> arr){
        if(root == null){
            // return arr;
            return;
        }
        if(root.left == null && root.right==null){
            arr.add(root.val);
        
        }
        trav(root.left, arr);
        trav(root.right, arr);
        // return arr;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> trav1= new ArrayList<>();
        ArrayList<Integer> trav2 = new ArrayList<>();
        // return trav(root1, trav1).equals(trav(root2, trav2));

        trav(root1, trav1);
        trav(root2, trav2);
        return trav1.equals(trav2);
        
    }
}