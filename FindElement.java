import java.util.Scanner;

public class FindElement {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("size of arrays :");
        int n = scn.nextInt();
        int []arr = new int [n];
        System.out.println("Elemnts of arrays : ");
        for (int i= 0 ; i <arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        
        int indx = -1;
        for(int i = 0; i <arr.length; i++){
            if(arr[i]==data){
                indx = i;
                break;
            }
        }
         System.out.println("index of the arrays :");
        System.out.println(indx); 
    }
}
