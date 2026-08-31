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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();

        map.put(0L,1);

        return dfs(root, 0, targetSum, map);
    }

    private int  dfs(TreeNode node, long currentSum, int targetSum, HashMap<Long, Integer> map){
        if(node == null)    return 0;

        currentSum += node.val;

        int cnt = map.getOrDefault( currentSum - targetSum, 0);

        map.put(currentSum, map.getOrDefault(currentSum, 0)+1);

        cnt += dfs(node.left, currentSum, targetSum, map);

        cnt += dfs(node.right, currentSum, targetSum, map);

        map.put(
            currentSum, map.get(currentSum) - 1
        );

        return cnt;
    }
}
