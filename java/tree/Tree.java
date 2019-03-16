package tree;

import java.util.ArrayList;

public class Tree {


    public static void preOrderTraversal(TreeNode node) {

        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.leftCheild);
            preOrderTraversal(node.rightChild);
        }
    }

    public static ArrayList preOrderTraversalWithoutRecur(TreeNode node){
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            preOrderTraversal(node.leftCheild);
            System.out.print(node.data + " ");
            preOrderTraversal(node.rightChild);
        }
    }

     public static void postOrderTraversal(TreeNode root) {
         if (root != null) {
             preOrderTraversal(root.leftCheild);
             preOrderTraversal(root.rightChild);
             System.out.print(root.data + " ");
         }
     }



     public static int countNodesInTree(TreeNode root){

        if(root == null) {
            return 0;
        }else {
                int i= 1;
                i =i + countNodesInTree(root.leftCheild);
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
         }else if(root.leftCheild != null || root.rightChild !=null){
             int i= 1;
             i =i + countNodesInTree(root.leftCheild);
             i =i + countNodesInTree(root.rightChild);
             return i;
         }
         return 0;
     }



    public static void main(String[] args) {
        TreeNode node = new TreeNode(50);
        node.setRightChild(new TreeNode(30));
        node.setLeftCheild(new TreeNode(20));
        node.leftCheild.setLeftCheild(new TreeNode(40));

        System.out.println(countNodesInTree(node));

        System.out.println("Pre-Order : ");
        preOrderTraversal(node);

        System.out.println("\nIn-Order : ");
        inOrderTraversal(node);

        System.out.println("\nPost-Order : ");
        postOrderTraversal(node);
    }


}

