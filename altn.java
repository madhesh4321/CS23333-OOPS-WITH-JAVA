import java.util.Scanner;
class altn{
public static void main(String [] args){
Scanner number= new Scanner(System.in);
System.out.println("enter num1:");
int n1=number.nextInt();
System.out.println("Enter num2:");
int n2=number.nextInt();
int a=(n1%10)+(n2%10);
System.out.println("The sum of last 2 num is:"+a);
}
}