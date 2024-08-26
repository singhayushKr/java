import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int num=s.nextInt();
        int fact=Factorial(num);
        System.out.println(fact);
    }

     static int Factorial(int n) {
        if(n<=1){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
}
