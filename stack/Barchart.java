package stack;
import java.util.Scanner;
public class Barchart {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sc = scn.nextInt();
        int []arr = new int [sc];

        for (int i= 0 ; i <arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int col = arr.length;
        int row = getMaxofAnArray(arr);
        System.out.println(row);
        //char[][] matrix = new char[row][col];
        
        for(int i = row; i >= 1; i--){
            for(int j  = 0; j < col; j++){
                if(arr[j] >= i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
       
    }

    public static int getMaxofAnArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

}
