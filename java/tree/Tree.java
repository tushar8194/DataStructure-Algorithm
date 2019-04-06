package tree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree {
    TreeNode    root;

    public Tree() {
        // TODO Auto-generated constructor stub
        this.root= null;
    }


    public  void preOrderTraversal(TreeNode node) {

        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    public  ArrayList preOrderTraversalWithoutRecur(TreeNode node){
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }

    public  void inOrderTraversal(TreeNode node) {
        if (node != null) {
            preOrderTraversal(node.leftChild);
            System.out.print(node.data + " ");
            preOrderTraversal(node.rightChild);
        }
    }

    public  void inOrderTraversalWithoutRecur(TreeNode node) {
        Stack<String> st=new Stack<>();

    }

     public  void postOrderTraversal(TreeNode root) {
         if (root != null) {
             preOrderTraversal(root.leftChild);
             preOrderTraversal(root.rightChild);
             System.out.print(root.data + " ");
         }
     }



     public  int countNodesInTree(TreeNode root){

        if(root == null) {
            return 0;
        }else {
                int i= 1;
                i =i + countNodesInTree(root.leftChild);
                i =i + countNodesInTree(root.rightChild);
                return i;
            }
     }

     public  int countNodesInTreeWithoutRecur(TreeNode root){

            return 0;

     }

     public int countNodes(TreeNode root){
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

     public  int getLeafNodeCount(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.leftChild == null && root.rightChild == null){
            return 1;
        }
        return getLeafNodeCount(root.leftChild) + getLeafNodeCount(root.rightChild);
     }



    public  int getHalfLeafNodeCount(TreeNode root){
        if(root == null){
            return 0;
        }
        if((root.leftChild == null && root.rightChild != null)  || (root.leftChild != null && root.rightChild == null )){
            return 1;
        }
        return (getLeafNodeCount(root.leftChild) + getLeafNodeCount(root.rightChild));
    }

    public void levelOrderTraversal(Tree root){

    }

    public boolean isMirror(TreeNode node1, TreeNode node2){
        if(node1 ==null && node2 == null){
            return true;
        }
        if(node1 ==null || node2 == null){
            return false;
        }
        else if(node1.data == node2.data){
            return (isMirror(node1.getLeftCheild(),node2.getRightChild()) && isMirror(node1.getRightChild(),node2.getLeftCheild()));
        }
        return false;
    }
    
}

