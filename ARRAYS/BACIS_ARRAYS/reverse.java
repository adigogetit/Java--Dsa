import java.util.Scanner;

public class reverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12,45,3,6,7,9,2};

        rev(arr);
        
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void rev(int[] arr){

        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
