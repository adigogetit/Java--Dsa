public class b {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12}};

        int srow = 0;
        int erow = 2;
        int scol = 0;
        int ecol = 3;

        while(scol<=ecol){
            for(int i=srow; i<=erow; i++){
                System.out.print(arr[i][scol]+" ");
            }
            System.out.println();
            scol++;
            for(int j=erow; j>=srow; j--){
                System.out.print(arr[j][scol]+" ");
            }
            System.out.println();
            scol++;
        }

    }
}
