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
    // eg:code in https://leetcode.com/problems/binary-tree-level-order-traversal/
    //uler below fun is the base
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

    public void preorder(TreeNode root)
    {
            //base case
            if(root == null)
            return;
            System.out.println("visitng "+root.val+" Pre area"); // pre area
            preorder(root.left);
            preorder(root.right);
           
    }
    public void inorder(TreeNode root)
    {
            //base case
            if(root == null)
            return;
            inorder(root.left);
            System.out.println("visitng "+root.val+" in area"); // pre area
            inorder(root.right);
    }
    public void postorder(TreeNode root)
    {
            //base case
            if(root == null)
            return;
            postorder(root.left);
            postorder(root.right);
            System.out.println("visitng "+root.val+" post area"); // pre area
    }
}
