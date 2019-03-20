package tree;

public class BinarySearchTree {

    public static void insertNode(int data,TreeNode root){
        TreeNode newNode = new TreeNode(data);
        TreeNode current = root;

        while (current != null ){

            if(data < current.data){
                if(current.leftChild != null ){
                    current = current.leftChild ;
                }
            }

        }
    }



    public static boolean isNodeExist(int data, TreeNode root){
        TreeNode current = root;

        while (current != null && current.data != data){
            if(current.data > data){
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }
        }

        if(current.data == data){
            return true;
        }else {
            return false;
        }

    }

    public TreeNode insertRecur(int data, TreeNode root){

        if(root == null){
            root = new TreeNode(data);
        } else {
            if(root.data < data){
                root.setRightChild(insertRecur(data,root.leftChild));
            } else {
                root.setRightChild(insertRecur(data,root.rightChild));
            }
        }
        return root;
    }

}
