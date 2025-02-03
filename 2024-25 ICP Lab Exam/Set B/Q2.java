import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1 ;
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print(num+" ");
            num*=3;
        }
        System.out.print(num+" ");
         sc.close();
    }
}
