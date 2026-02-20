// TRANSPOSE OF A MATRIX
public class c {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {5,6,7},
                     {9,10,11}};

                    
    trans(arr);
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}

    public static void trans(int[][] arr){
                        
        for(int i=0; i<3; i++){
            for(int j=i+1; j<3; j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
