package tree;

public class TreeNode {
    TreeNode leftCheild;
    TreeNode rightChild;
    int data;

    public TreeNode(int data, TreeNode leftCheild, TreeNode rightChild){
        this.leftCheild = leftCheild;
        this.rightChild = rightChild;
        this.data = data;
    }

    public TreeNode(int data){
        this.leftCheild = leftCheild;
        this.rightChild = rightChild;
        this.data = data;
    }

    public TreeNode getLeftCheild() {
        return leftCheild;
    }

    public void setLeftCheild(TreeNode leftCheild) {
        this.leftCheild = leftCheild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
