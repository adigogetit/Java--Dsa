public class diameter_subtree {
    static class Node {
        int data;
        Node left;
        Node right;

        // constructer
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Height for find diameter 1
    public static int height(Node root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    // Find diameter - Approach 1: O(n^2) in the worst case
    // Because height() is recalculated for every node, causing repeated traversal of the same subtrees.
    public static int dia1(Node root) {
        if (root == null)
            return 0;

        int leftd = dia1(root.left);
        int rightd = dia1(root.right);

        int lefth = height(root.left);
        int righth = height(root.right);

        int selfdia1 = lefth + righth + 1;

        return Math.max(Math.max(leftd, rightd), selfdia1);
    }
    


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Height
        System.out.println(height(root));

        // Diamater 1 O(n^2)
        System.out.println(dia1(root));
        // Diameter 2 - O(n)
        System.out.println(dia2(root).dia);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        // subtree in tree
        System.out.println(isSubtree(root, subRoot));
    }
}
