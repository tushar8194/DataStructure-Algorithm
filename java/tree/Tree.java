package tree;

import java.util.ArrayList;

public class Tree {


    public static void preOrderTraversal(TreeNode node) {

        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    public static ArrayList preOrderTraversalWithoutRecur(TreeNode node){
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            preOrderTraversal(node.leftChild);
            System.out.print(node.data + " ");
            preOrderTraversal(node.rightChild);
        }
    }

     public static void postOrderTraversal(TreeNode root) {
         if (root != null) {
             preOrderTraversal(root.leftChild);
             preOrderTraversal(root.rightChild);
             System.out.print(root.data + " ");
         }
     }



     public static int countNodesInTree(TreeNode root){

        if(root == null) {
            return 0;
        }else {
                int i= 1;
                i =i + countNodesInTree(root.leftChild);
                i =i + countNodesInTree(root.rightChild);
                return i;
            }
     }

     public static int countNodesInTreeWithoutRecur(TreeNode root){

            return 0;

     }

     public static int countLeafNodes(TreeNode root){
         if(root == null) {
             return 0;
         }else if(root.leftChild != null || root.rightChild !=null){
             int i= 1;
             i =i + countNodesInTree(root.leftChild);
             i =i + countNodesInTree(root.rightChild);
             return i;
         }
         return 0;
     }


}

