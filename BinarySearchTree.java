 class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    Node root;

    void delete(int data) {
        root = deleteNode(root, data);
    }

    Node deleteNode(Node currentNode, int data) {
        if (currentNode == null) {
            return currentNode;
        }
        
        if (data < currentNode.data) {
            currentNode.left = deleteNode(currentNode.left, data);
        } else if (data > currentNode.data) {
            currentNode.right = deleteNode(currentNode.right, data);
        } else {
            
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }

           
            if (currentNode.left == null) {
                return currentNode.right;
            } else if (currentNode.right == null) {
                return currentNode.left;
            }

            
            currentNode.data = minValue(currentNode.right);

            // Delete the node with the minimum value in the right subtree
            currentNode.right = deleteNode(currentNode.right, currentNode.data);
        }
        return currentNode;
    }

    int minValue(Node node) {
        int minValue = node.data;
        while (node.left != null) {
            node = node.left;
            minValue = node.data;
        }
        return minValue;
    }

    void printTree() {
        printTree(root);
    }

    void printTree(Node node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.data + " ");
            printTree(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(50);
        bst.root.left = new Node(30);
        bst.root.left.left = new Node(20); 
        bst.root.left.right = new Node(40);
        bst.root.right = new Node(70);
        bst.root.right.left = new Node(60);
        bst.root.right.right = new Node(80);

        System.out.println("Before Deletion:");
        bst.printTree(); // Prints the tree before deletion
        System.out.println();

        bst.delete(70);

        System.out.println("After Deletion:");
        bst.printTree(); 
    }
}
