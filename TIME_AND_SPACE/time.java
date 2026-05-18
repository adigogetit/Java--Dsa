public class time {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for(int i=0; i<1000000000; i++){
            
        }
        long l = System.currentTimeMillis();
        System.out.println(l-s);
        
    }
}
