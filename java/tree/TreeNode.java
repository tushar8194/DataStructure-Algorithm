package tree;

public class TreeNode {
    TreeNode leftChild;
    TreeNode rightChild;
    int data;

    public TreeNode(int data, TreeNode leftChild, TreeNode rightChild){
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.data = data;
    }

    public TreeNode(int data){
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.data = data;
    }

    public TreeNode getLeftCheild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftCheild) {
        this.leftChild = leftCheild;
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
