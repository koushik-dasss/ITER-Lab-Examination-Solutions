// Magic Year
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to be checked : ");
        int year = sc.nextInt();
        int sum = 0 ;
        for(int i = 1 ; i<=9 ; i++){
            sum+=(i*i*i);
        }
        if(sum==year){
            System.out.println("The year "+ year+" is a magic year. ");
        }else{
            System.out.println("The year "+ year+" is not a magic year.");
        }
        sc.close();
    }
}
