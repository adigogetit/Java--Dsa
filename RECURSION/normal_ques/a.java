
public class a {
    public static void main(String[] args) {
        int n = 10;
        number(n);   
        num(n);   
    }
    //  n to 1
    public static void number(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        number(n-1);
    }

    //  1 to n
    public static void num(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        num(n-1);
        System.out.println(n);
    }
}
