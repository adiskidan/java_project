// 7. Make Grade Report using switch statements
import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        
        String grade = sc.next();
        grade = grade.toUpperCase();
        
        switch (grade) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");
                break;
            case "F":
                System.out.println("F");
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}