
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTSearch {
    Node root;

    // Insert node
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    // Search key
    boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Inorder
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSearch bst = new BSTSearch();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            bst.root = bst.insert(bst.root, value);
        }

        System.out.print("Inorder: ");
        bst.inorder(bst.root);

        System.out.print("\nPreorder: ");
        bst.preorder(bst.root);

        System.out.print("\nPostorder: ");
        bst.postorder(bst.root);

        // Search key
        System.out.print("\nEnter key to search: ");
        int key = sc.nextInt();

        if (bst.search(bst.root, key)) {
            System.out.println("Key " + key + " found in the BST.");
        } else {
            System.out.println("Key " + key + " not found in the BST.");
        }

        sc.close();
    }
}
    
