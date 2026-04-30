package practice_pack.BinaryTrees;

import java.util.*;

public class Traversals {
    public static class Node{
        int key;
        Node right, left;
    }
    public static Node newNode(int key){
        Node node = new Node();
        node.key = key;
        node.left = node.right = null;
        return node;
    }
    public static void DFSInOrderTraversal(Node root){
        if(root == null)
            return;
        DFSInOrderTraversal(root.left);
        System.out.print(root.key + " ");
        DFSInOrderTraversal(root.right);
    }
    public static void DFSPreOrderTraversal(Node root){
        if(root == null)
            return;
        System.out.print(root.key + " ");
        DFSPreOrderTraversal(root.left);
        DFSPreOrderTraversal(root.right);
    }
    public static void DFSPostOrderTraversal(Node root){
        if(root == null)
            return;
        DFSPostOrderTraversal(root.left);
        DFSPostOrderTraversal(root.right);
        System.out.print(root.key + " ");
    }

    public static int getTreeHeight(Node root){
        if(root == null)
            return 0;

        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        return 1+Math.max(leftHeight, rightHeight);
    }

    public static void BFSLevelOrderTraversalRecursive(Node root, int level){
        if(root == null)
            return;

        if(level==0){
            System.out.print(root.key + " ");
            return;
        }
        BFSLevelOrderTraversalRecursive(root.left, level-1);
        BFSLevelOrderTraversalRecursive(root.right, level-1);
    }
    public static void BFSLevelOrderTraversalIterative(Node root){
        if(root == null)
            return;

        Queue <Node> nodes = new LinkedList<>();
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
    public static void BFSZigZagTraversal(Node root, int level,boolean flag){
        if(root == null)
            return;

        if(level==0){
            System.out.print(root.key + " ");
            return;
        }
        if(flag){
            BFSZigZagTraversal(root.right, level-1,flag);
            BFSZigZagTraversal(root.left, level-1,flag);
        }
        else{
            BFSZigZagTraversal(root.left, level-1,flag);
            BFSZigZagTraversal(root.right, level-1,flag);
        }
    }
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.right = newNode(6);
        DFSInOrderTraversal(root);
        System.out.println();
        DFSPreOrderTraversal(root);
        System.out.println();
        DFSPostOrderTraversal(root);
        System.out.println();
        int treeHeight = getTreeHeight(root);
        System.out.println("Height of the tree" + treeHeight);
        for(int i=0; i<=treeHeight; i++){
            BFSLevelOrderTraversalRecursive(root,i);
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<=treeHeight; i++){
            BFSZigZagTraversal(root,i,i%2==0);
            System.out.println();
        }
        System.out.println();
        BFSLevelOrderTraversalIterative(root);
    }
}
