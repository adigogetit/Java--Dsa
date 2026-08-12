import java.util.*;

public class min_dis {
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

    public static int lcadis(Node root, int n){
        if(root == null)return -1;

        if(root.data == n)return 0;

        int ldis = lcadis(root.left, n);
        int rdis = lcadis(root.right, n);

        if(ldis == -1 && rdis == -1)return -1;
        else if(ldis == -1)return rdis + 1;
        else return ldis + 1;
    }


    public static int min_dis(Node root,int n1,int n2){

        Node lca = lca2(root, n1, n2);// yaha se lca mill jayega 
        int dis1 = lcadis(lca, n1);
        int dis2 = lcadis(lca, n2);

        return dis1 + dis2;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 6;
        System.out.println(min_dis(root, n1, n2));

    }
}


