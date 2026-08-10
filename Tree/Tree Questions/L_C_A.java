import java.util.*;

public class L_C_A {
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

    // way 1
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root == null)return false;

        path.add(root);

        if(root.data == n)return true;

        boolean findleft = getPath(root.left, n, path);
        boolean findright = getPath(root.right, n, path);

        if(findleft || findright)return true;

        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common ancestor         
        int i=0;
        for(; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        // last equal node is 
        Node lca = path1.get(i-1);
        return lca;
    }

    // way-2
    public static Node lca2(Node root,int n1,int n2){
        if(root == null)return null;

        // if root is equal to n1 or n2 then return root
        if(root.data == n1 || root.data == n2){
            return root;
        }

        // search in left and right subtree 
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        // if leftlca is null then return rightlca
        if(leftlca == null)return rightlca;
        if(rightlca == null)return leftlca;

        return root;
    }


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

       int n1 = 7;
       int n2 = 4;
       // way-1
       System.out.println(lca(root, n1, n2).data);
       // way-2
       System.out.println(lca2(root, n1, n2).data);

    }
}

