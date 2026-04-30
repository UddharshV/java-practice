package practice_pack.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class insertElementBT {
    public static class Node{
        int key;
        Node left,right;
    }
    public static Node newNode(int key){
        Node node = new Node();
        node.key = key;
        node.left = node.right = null;
        return node;
    }

    public static Node insertElementLO(Node root, int element){
        Node temp = root;
        if(root == null)
            return null;

        Queue<Node> nodes = new LinkedList<>();

        nodes.add(root);
        int levelNo;

        while(!nodes.isEmpty()) {
            levelNo = nodes.size() - 1;
            for (int i = 0; i <= levelNo; i++) {
                root = nodes.peek();
                if (root.left != null)
                    nodes.add(root.left);
                else {
                    root.left = newNode(element);
                    return temp;
                }
                if (root.right != null)
                    nodes.add(root.right);
                else{
                    root.right = newNode(element);
                    return temp;
                }
                nodes.remove();
            }
        }
        return temp;
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
                levelNodes.add(nodes.peek().key);
                nodes.remove();
            }
            visited.add(levelNodes);
        }
        for(List<Integer> levelNodeList : visited)
            System.out.println(levelNodeList);
    }
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.right = newNode(6);
        root = insertElementLO(root, 7);
        BFSLevelOrderTraversalIterative(root);
    }
}
