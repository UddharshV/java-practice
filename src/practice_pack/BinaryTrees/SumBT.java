package practice_pack.BinaryTrees;

public class SumBT {
    public static class Node{
        int key;
        Node left, right;
    }
    public static Node newNode(int key){
        Node node = new Node();
        node.key = key;
        node.left = node.right = null;
        return node;
    }
    public static int sumNodes(Node root){
        if(root==null)
            return 0;
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);
        return root.key+leftSum+rightSum;
    }
    public static void main(String args[]){
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(6);
        root.right.right = newNode(7);
        root.right.left.right = newNode(8);

        System.out.println("Sum of all elements is: " + sumNodes(root));
    }
}
