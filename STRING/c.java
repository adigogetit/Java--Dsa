
// lexographical order

public class c {
    public static void main(String[] args) {
        String s1 = "kunal";
        String s2 = "komal";

        System.out.println(s1.compareTo(s2));
        // if its 0 then s1=s2
        // if -ve then s2>s1
        // if +ve then s1>s2
        // it will diff of ascii value from where value is change  that is u-o = 6
        System.out.println(lexo(s1,s2));


    }

    public static int lexo(String s1, String s2){
        if(s1==s2){
            return 0;
        }
        int n = Math.min(s1.length(),s2.length());
        for(int i=0; i<n; i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        } 
        return s1.length() - s2.length();
    }
    
}
