import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of first array : ");
        int n1 = sc.nextInt();
        System.out.println("Enter number of elements of second array : ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements in both arrays : ");
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i = 0 ; i< n1 ; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        for(int i = 0 ; i< n2 ; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Common elements are : ");
        for(int i = 0 ; i< n1 ; i++){
            for(int j = 0 ; j< n2 ; j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
        sc.close();
    }
}





