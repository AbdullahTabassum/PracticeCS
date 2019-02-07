package Trees;

public class TreeNode {

    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.value = val;
    }

    public void setDec(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
