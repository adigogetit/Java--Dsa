public class Partitioning {
    public static void main(String[] args) {
        String ques ="nitin";
        Solve(ques,"");
    }

    public static void Solve(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int cut=1; cut<=ques.length(); cut++){
            String s = ques.substring(0,cut);
            Solve(ques.substring(cut) , ans+s+"|");
        }
    }
    
}
