//leetcode 111
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> q=new LinkedList<>();
        int level=1;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            
            while(size-->0){
                TreeNode temp=q.poll();
                if(temp.left==null&&temp.right==null)return level;
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            level++;
        }
        return level;
    }
}