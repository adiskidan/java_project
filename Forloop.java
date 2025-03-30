import java.util.Scanner;
public class Forloop{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
int i;
int sum=0;
for(i=0;i<=n;i++){
if(i%5==0){
break;}
sum=sum+i;}
System.out.println("the sum number:"+sum);}}