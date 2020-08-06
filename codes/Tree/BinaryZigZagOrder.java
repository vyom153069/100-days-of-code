//leetcode 103
//solution
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return res;
        boolean yes=false;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> al=new ArrayList<>();
            Stack<Integer> stack=new Stack<>();
            while(size-->0){
                TreeNode temp=q.poll();
                if(yes)stack.add(temp.val);
                else al.add(temp.val);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            while(!stack.isEmpty()){
                al.add(stack.pop());
            }
            res.add(al);
            if(yes)yes=false;
            else yes=true;
        }
        return res;
    }
}