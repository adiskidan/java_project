import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        
        if (marks >= 85 && marks <= 100) {
            System.out.println("A grade");
        } else if (marks >= 70 && marks < 85) {
            System.out.println("B grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("F grade");
        } else {
            System.out.println("Invalid!");
        }
    }
}
