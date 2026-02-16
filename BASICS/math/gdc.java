public abstract class gdc{
    public static void main(String[] args) {
        
        int divident = 60;
        int divisor = 36; 

        while(divident % divisor != 0){
            int reminder = divident % divisor ;
            divident = divisor;
            divisor = reminder;
            System.out.println(divisor +" ");
        }
    }

}
