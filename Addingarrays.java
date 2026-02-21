import java.util.Scanner;
public class Addingarrays {
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

        // System.out.println("Sum of two array" + sumOfTwoArrays(arr1, arr2));
        int[] res = sumOfTwoArrays(arr1, arr2);
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }

    public static int[] sumOfTwoArrays(int[] arr1, int[]arr2) {
        int n = Math.max(arr1.length , arr2.length);
        int[] res = new int[n+1];
        int carry = 0;
        int sum = 0;
        for (int i = n; i >= 0; i--){
            int arr1Idx = i - (res.length - arr1.length);
            int arr2Idx = i - (res.length - arr2.length);
            int cvArr1 = arr1Idx < 0 ? 0 : arr1[arr1Idx];
            int cvArr2 = arr2Idx < 0 ? 0 : arr2[arr2Idx];
            if(carry > 0) {
                sum = carry + cvArr1 + cvArr2;
                carry--;
            }
            else sum = cvArr1 + cvArr2;
            if(sum >= 10) {
                carry = sum / 10;
                res[i] = sum % 10;
            } else {
                res[i]= sum;
            }

        }
        
        return res;
    }
}