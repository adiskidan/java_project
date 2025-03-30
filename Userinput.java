import java.util.Scanner;
public class Userinput{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the first number:");
int a=s.nextInt();
System.out.println("enter the second number:");
int b=s.nextInt();
System.out.println("enter the three number:");
int c=s.nextInt();
int sum,sub;
sum=a+b+c;
sub=a-b-c;
System.out.println("enter the sum number:"+sum);
System.out.println("enter the subnumber:"+sub);
}}