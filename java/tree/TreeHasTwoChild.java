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
        tree.root.rightChild.leftChild = new TreeNode(11);

        boolean result = haveTwoChild(tree.root);

        if(result == true){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static boolean haveTwoChild(TreeNode root){
        if(root == null){
            return true;
        }else if(root.leftChild == null && root.rightChild == null){
            return true;
        }else if(root.leftChild == null || root.rightChild == null){
            return false;
        }else {
            boolean flag = true;

            flag = flag && haveTwoChild(root.leftChild);
            flag = flag && haveTwoChild(root.rightChild);

            return flag;
        }
    }
}
