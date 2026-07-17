public class height_sum_count {
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

    public static int height(Node root){
        if(root == null)return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left,right)+1;
    }
    
    public static int count(Node root){
        if(root == null)return 0;
        
        int left = count(root.left);
        int right = count(root.right);
    
        return left + right + 1;
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
        // Count of Nodes
        System.out.println(count(root));
        // Sum of Nodes
        System.out.println(count(root));
    }
}
