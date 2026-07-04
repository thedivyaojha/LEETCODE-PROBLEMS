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
    public int  countnodes(TreeNode node, int max, int count){
        //base case
        if(node == null)return count;
        if(node.val >= max){
            max = node.val;
            count++;
        }
        count=countnodes(node.left, max, count);
        count=countnodes(node.right, max, count);
        return count;
    }


    public int goodNodes(TreeNode root) {
        if(root == null)return 0;
        
       

        return countnodes(root, root.val, 0);

    }
}