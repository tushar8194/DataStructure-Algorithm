package tree;

public class TreeDriver {
<<<<<<< HEAD


    public static void main(String[] args) {

        Tree t = new Tree();

        TreeNode node = new TreeNode(50);
        node.setRightChild(new TreeNode(30));
        node.setLeftCheild(new TreeNode(20));
       // node.leftCheild.setLeftCheild(new TreeNode(40));

        System.out.println("Count of Nodes : " + t.countNodesInTree(node));

        System.out.println("Pre-Order : ");
        t.preOrderTraversal(node);

        System.out.println("\nIn-Order : ");
        t.inOrderTraversal(node);

        System.out.println("\nPost-Order : ");
        t.postOrderTraversal(node);


        System.out.println("\nNode Count :");
        System.out.println(t.countNodes(node));

        System.out.println("\nLeaf Node Count :");
        System.out.println(t.getLeafNodeCount(node));


        // TODO Auto-generated method stub
        Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.leftCheild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(3);
        tree.root.rightChild.leftCheild = new TreeNode(30);
        tree.root.rightChild.leftCheild.rightChild = new TreeNode(55);
        tree.root.leftCheild.leftCheild = new TreeNode(4);


        System.out.println("\nHalf Leaf Node");
        System.out.println(t.getHalfLeafNodeCount(node));


        System.out.println("------------------");


        TreeNode node2 = new TreeNode(50);
        node2.setRightChild(new TreeNode(30));
        node2.setLeftCheild(new TreeNode(20));

        System.out.println(t.isMirror(node,node2));


=======
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
>>>>>>> 0c46682e291ae8d98bdcd2b806b097c0fb070eb7
    }
}
