import java.util.Scanner;

public class Return_int {
    public static void main(String[] args) {
        int ans=sum2();//function call;
System.out.println(ans);
    }
    static int sum2(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=s.nextInt();
        System.out.print("Enter number 2: ");
        int num2=s.nextInt();
//        int sum=num1+num2;
        return num1+num2;
    }

}
