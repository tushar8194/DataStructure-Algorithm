package tree;

public class TreeHasTwoChild {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root = new TreeNode(10);
        tree.root.leftChild = new TreeNode(6);
        tree.root.rightChild = new TreeNode(12);
        tree.root.leftChild.rightChild = new TreeNode(7);
        tree.root.leftChild.leftChild = new TreeNode(5);
        tree.root.rightChild.rightChild = new TreeNode(13);
        //tree.root.rightChild.leftChild = new TreeNode(11);

        int result = haveTwoChild(tree.root);

        if(result != 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

    public static int haveTwoChild(TreeNode root){
        if(root == null){
            return 1;
        }else if(root.leftChild == null && root.rightChild == null){
            return 1;
        }else if(root.leftChild == null || root.rightChild == null){
            return 0;
        }else {
            int flag = 1;

            flag = flag * haveTwoChild(root.leftChild);
            flag = flag * haveTwoChild(root.rightChild);

            return flag;
        }
    }
}
