package tree;

import java.util.Stack;

public class PrintAllRootToLeafPath {

    public static void main(String[] args) {

        TreeNode node2 = new TreeNode(50);
        node2.setRightChild(new TreeNode(30));
        node2.setLeftChild(new TreeNode(20));

    }

    public static void rootToLeaf(TreeNode root){

        Stack<TreeNode> st = new Stack<>();

        if(root == null){
            return;
        }
        st.push(root);
        rootToLeaf(root.getLeftCheild());
        if(root.rightChild == null && root.leftChild == null){
            System.out.println();
        }

    }
}
