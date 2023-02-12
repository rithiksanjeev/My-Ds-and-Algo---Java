public class tre {
    //user defined data type creation
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        TreeNode(int data,TreeNode left,TreeNode right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        
    }
    
    public void fun(TreeNode root)
    {
        //base case
        if(root == null)
        return;
        System.out.println("visitng "+root.val+" First Time");
        fun(root.left);
        System.out.println("visitng "+root.val+" Second Time");
        fun(root.right);
        System.out.println("visitng "+root.val+" Third Time");
    }
}
