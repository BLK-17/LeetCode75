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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lt1 = new ArrayList<>();
        List<Integer> lt2 = new ArrayList<>();

        dfs(root1, lt1);
        dfs(root2, lt2);

        return lt1.equals(lt2);
    }
    
    public void dfs(TreeNode root, List<Integer> list){
        if(root == null)    return;

        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }

        dfs(root.left, list);
        dfs(root.right, list);
    }
}
