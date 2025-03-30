//10. List multiple of 12 by using for loop
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
   System.out.println("enter the number:");
      int n=s.nextInt();
       int fa,i;
       i=1;
      fa=1;
        for(int i=1; i<=n; i++) {
             fa=fa*i;
             System.out.println("Multiple: " +fa);
            }
        }
    }

