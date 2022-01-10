package BinaryTreeTest;

import java.util.Stack;

public class BinaryTreePractice {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);

        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.left = new Node(6);
        binaryTree.root.right.right = new Node(7);

        // printTreeData(binaryTree.root);
        // System.out.println(" After Mirror");
        // mirrorTree(binaryTree.root);
        // printTreeData(binaryTree.root);

        mirrorTreeIteratively(binaryTree);

    }

    public static void printTreeData(Node node) {

        if (node == null)
            return;
        printTreeData(node.left);
        if (node.left == null && node.right == null)
            System.out.println(node.data);
        printTreeData(node.right);

    }

    public static void mirrorTree(Node node) {
        if (node == null)
            return;
        if (node.left != null && node.right != null) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        mirrorTree(node.left);
        mirrorTree(node.right);
    }

    public static void mirrorTreeIteratively(BinaryTree binaryTree) {
        Stack<Node> nodeStack = new Stack<>();
        Node parent = binaryTree.root;
        nodeStack.push(binaryTree.root);

        while (nodeStack != null) {
            parent = nodeStack.pop();
            Node temp = parent.left;
            parent.left = parent.right;
            parent.right = temp;
            if (parent.right != null) {
                nodeStack.push(parent.right);
            }
            if (parent.right != null) {
                nodeStack.push(parent.left);
            }
        }
    }



}
