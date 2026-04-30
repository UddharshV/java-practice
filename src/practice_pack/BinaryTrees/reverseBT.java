package practice_pack.BinaryTrees;

public class reverseBT {
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
    public static void reverseTree(Node root){
        if(root == null)
            return;
        reverseTree(root.left);
        reverseTree(root.right);

        Node temp = root.left;
        root.left=root.right;
        root.right=temp;
    }
    public static void DFSInOrderTraversal(Node root){
        if(root == null)
            return;
        DFSInOrderTraversal(root.left);
        System.out.print(root.key + " ");
        DFSInOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.right = newNode(6);
        System.out.print("Inorder traversal before reversal: ");
        DFSInOrderTraversal(root);
        System.out.println();
        reverseTree(root);
        System.out.print("Inorder traversal after reversal: ");
        DFSInOrderTraversal(root);
        System.out.println();
    }
}
