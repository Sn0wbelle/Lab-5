import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BST<Integer> lab5Tree = new BST<>();

        // Insert values
        int[] values = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};

        for (int v : values) {
            lab5Tree.insert(v);
        }

        // Delete 17
        lab5Tree.delete(17);

        // Inorder traversal
        System.out.print("Inorder (sorted): ");
        lab5Tree.inorder();
        System.out.println();

        // Postorder traversal
        System.out.print("Postorder: ");
        lab5Tree.postorder();
        System.out.println();

        // Preorder traversal
        System.out.print("Preorder: ");
        lab5Tree.preorder();
        System.out.println();

        // Search results
        System.out.println("Search for 36: " + lab5Tree.search(36));
        System.out.println("Search for 37: " + lab5Tree.search(37));

        // Path to 2
        System.out.print("Path to 2: ");
        printPath(lab5Tree.path(2));

        // Path to 34
        System.out.print("Path to 34: ");
        printPath(lab5Tree.path(34));
    }

    // Helper method to print path cleanly
    public static void printPath(ArrayList<BST.TreeNode<Integer>> path) {
        for (BST.TreeNode<Integer> node : path) {
            System.out.print(node.element + " ");
        }
        System.out.println();
    }
}