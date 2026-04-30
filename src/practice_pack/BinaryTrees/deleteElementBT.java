package practice_pack.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class deleteElementBT {
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
//    public static int findLastElement(Node root){
//        if(root == null)
//            return -1;
//
//
//    }
    public static void deleteEle(Node root, int element, int replacement){
        if(root==null)
            return;
        if(root.key==element)
            root.key=replacement;
        deleteEle(root.left,element,replacement);
        deleteEle(root.right,element,replacement);
    }
    public static void BFSLevelOrderTraversalIterative(Node root){
        if(root == null)
            return;

        Queue<Node> nodes = new LinkedList<>();
        List <List<Integer>> visited = new ArrayList<>();
        nodes.add(root);
        int levelNo;
        while(!nodes.isEmpty()) {
            levelNo = nodes.size()-1;

            List<Integer> levelNodes = new ArrayList<>();

            for (int i = 0; i<=levelNo; i++) {
                root = nodes.peek();
                if (root.left != null)
                    nodes.add(root.left);
                if (root.right != null)
                    nodes.add(root.right);
//                levelNodes.add(nodes.peek().key);
                nodes.remove();
            }
            visited.add(levelNodes);
        }
        for(List<Integer> levelNodeList : visited)
            System.out.println(levelNodeList);
    }
    public static void main(String args[]){
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(19);
        root.right.left = newNode(16);
        root.right.right = newNode(9);
////        int replacement = findLastElement(root);
//        System.out.println(replacement);
//        deleteEle(root, 12, replacement);
        BFSLevelOrderTraversalIterative(root);

    }
}
