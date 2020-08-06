//leetcode 107
//solution
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        if(root==null)return al;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<Integer> ll=new ArrayList<>();
        ll.add(root.val);
        al.add(ll);
        while(!q.isEmpty()){
           
            int size=q.size();
            List<Integer> all=new ArrayList<>();
            while(size-->0){
                 TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                    all.add(temp.left.val);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    all.add(temp.right.val);
                }
            }
            al.add(all);
        }
        Collections.reverse(al);
        al.remove(0);
        return al;
    }
}