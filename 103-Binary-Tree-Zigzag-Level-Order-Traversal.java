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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);int cnt=0;
       while(!q.isEmpty()){
            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            while(size-- !=0){
                TreeNode dummy=q.poll();
                temp.add(dummy.val);
                if(dummy.left!=null) q.add(dummy.left);
                if(dummy.right!=null) q.add(dummy.right);
            }
            if(cnt%2==0){
                res.add(temp);
            }
            else{
                Collections.reverse(temp);
                res.add(temp);
            }
            cnt++;
            
       }

        return res;
    }
}






























