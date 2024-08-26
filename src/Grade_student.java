import java.util.Scanner;

public class Grade_student {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks=s.nextInt();
        String grades=find_grades(marks);
        System.out.println(grades);
    }
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    static String find_grades(int score) {
        if (score>100){
            return "Invalid score.";
        }
        if (score>90){
            return "AA";
        }
        if (score>80){
            return "AB";
        }
        if (score>70){
            return "BB";
        }
        if (score>60){
            return "BC";
        }
        if (score>50){
            return "CD";
        }
        if (score>40){
            return "DD";
        }
        else{
            return "Fail";
        }

    }
}
