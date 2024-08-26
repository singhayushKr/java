import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        sum();//function call;
int asn=sum3(20,50);
System.out.println(asn);
    }
//    static void sum(){
//        Scanner s=new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1=s.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2=s.nextInt();
//        int sum=num1+num2;
//        System.out.println("the sum = "+sum);
//    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
}