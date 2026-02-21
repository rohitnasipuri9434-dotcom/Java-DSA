package stack;
import java.util.Scanner;
public class DifferenceOfTwoArrays {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int size1 = scn.nextInt();
        System.out.println("Enter the size of array2: ");
        int size2 = scn.nextInt();
        int []arr1 = new int [size1];
        int []arr2 = new int [size2];
        
        System.out.println("Enter the elements of array1: ");
        for (int i = 0; i < size1; i++){
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter the elements of array2: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scn.nextInt();
        }
          int[] res = DifferenceOfTwoArrays(arr1, arr2);
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }
    public static int [] DifferenceOfTwoArrays (int[] arr1,int[] arr2) {
        int n = Math.max(arr1.length, arr2.length);
        int [] res = new int [n+1];
        int carry = 0;
        int Difference = 0;
            for(int i = n; i >= 0; i--){
                int aar1Indx = i - (res.length - arr1.length);
                int arr2Indx = i - (res.length - arr2.length);
                int cvArr1 = arr1Idx;
                int cvArr2 = arr2Idx;
                if(cvArr1-cvArr2 < 0){
                    cvArr1 += 10;
                    Difference = cvArr1 - cvArr2;

                }else Difference = cvArr1 - cvArr2;
                if(carry > 0){
                    Difference = carry + cvArr1;
                }else {
                    res[i]= Difference;
                }
            }
        }
}
    




