package tree;

public class TreeDriver {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(50);
        node.setRightChild(new TreeNode(30));
        node.setLeftChild(new TreeNode(20));
        node.leftChild.setLeftChild(new TreeNode(40));

        System.out.println(Tree.countNodesInTree(node));

        System.out.println("Pre-Order : ");
        Tree.preOrderTraversal(node);

        System.out.println("\nIn-Order : ");
        Tree.inOrderTraversal(node);

        System.out.println("\nPost-Order : ");
        Tree.postOrderTraversal(node);
    }
}
