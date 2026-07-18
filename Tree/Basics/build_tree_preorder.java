public class build_tree_preorder {

    static class Node{
        int data;
        Node left;
        Node right;

        // constructer
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // New class for  Binary-Tree
    static class Binary_tree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            // if no -1 then make new node  by  calling a  constructer
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binary_tree tree = new Binary_tree();

        Node root = tree.buildTree(nodes);

        System.out.println(root.data);

    }
}