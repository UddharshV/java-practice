package practice_pack.BinaryTrees;

public class SearchBT {
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
    public static boolean searchEle(Node root, int target){
        if(root==null)
            return false;

        return root.key == target || searchEle(root.left, target) || searchEle(root.right, target);

    }
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.right = newNode(6);
        System.out.println(searchEle(root,6));
    }
}
