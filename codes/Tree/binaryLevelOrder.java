//leetcode 102
//solution
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            
            List<Integer> al=new ArrayList<>();
            int size=q.size();
            while(size-->0){
                TreeNode temp=q.poll();
                al.add(temp.val);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            res.add(al);
        }
        return res;
    }
}