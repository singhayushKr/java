import java.util.Scanner;

public class Min_max {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter three numbers with space separated");
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        int min_of_three=minimum(x,y,z);
        int max_of_three=maximum(x,y,z);
        System.out.println("minimun is "+min_of_three);
        System.out.println("maximum is "+max_of_three);

    }
    static int maximum(int a, int b, int c) {
        return Math.max(c,Math.max(a,b));
    }

    static int minimum(int a,int b,int c){
        return Math.min(c,Math.min(a,b));
    }
}
