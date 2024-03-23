

class Rightview {
    List<Integer> li =new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        calculate(root,0);
        return li ;
    }

    public void calculate(TreeNode curr, int l)
    {
        if(curr==null)
        {
            return;
        }
        if(li.size()==l)
        {
            li.add(curr.val);
        }
        calculate(curr.right, l+1);
        calculate(curr.left, l+1);
        
    }
}