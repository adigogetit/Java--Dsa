import java.util.*;

public class order_Traversal {
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

    // New class for Binary-Tree
    static class Binary_tree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            // if no -1 then make new node by calling a constructer
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root == null) return;

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);

        }

        public static void inorder(Node root){
            if(root == null)return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null)return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        

        public static void levelorder(Node root){
            if(root == null)return;

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currnNode = q.remove();
                if(currnNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currnNode.data + " ");
                    if(currnNode.left != null){
                        q.add(currnNode.left);
                    }
                    if(currnNode.right != null){
                        q.add(currnNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Binary_tree tree = new Binary_tree();

        //to build tree
        Node root = tree.buildTree(nodes);

        // preorder
        System.out.print("Preorder - ");
        tree.preorder(root);
        System.out.println();

        // inorder
        System.out.print("Inorder - ");
        tree.inorder(root);
        System.out.println();

        // postorder
        System.out.print("Postorder - ");
        tree.postorder(root);
        System.out.println();
        
        // level order
        System.out.println("Level Order ");
        tree.levelorder(root);


    }
}
