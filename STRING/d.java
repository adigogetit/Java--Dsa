
// PRINT SUBSTRING LENGTH WISE 

public class d {
    public static void main(String[] args) {
        String s = "hello";

        int n = s.length();
        
        for(int len=0; len<=n; len++){
            for(int j=len; j<=n; j++){
                int i = j-len;
                System.out.println(s.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
}
