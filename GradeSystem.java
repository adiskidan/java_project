import java.util.Scanner;
public class GradeSystem{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the mark number:");
float mark=s.nextInt();
if (mark<=100 && mark>=90 ){
System.out.println("A+");
}
else if (mark<=90 && mark>=85){
System.out.println('A');}
else if(mark>=80&& mark<85){
System.out.println("A-");}
else if(mark>=75 && mark<80){
System.out.println("B+");}
else if(mark>=70 && mark<75){
System.out.println('B');}
else if(mark>=65 && mark<70){
System.out.println("B-");}
else if(mark>=60 && mark<65){
                   System.out.println("C+");}
else if(mark>=50 && mark<60){
System.out.println('C');}
else if(mark>=40 && mark<50){
System.out.println('D');}
else{
System.out.println("Fail");}
}}                                                