import java.util.Scanner;
class drink{
public static void main(String [] args){
Scanner dc=new Scanner(System.in);
System.out.println("drink containers holds '1' or 'less than 1' liter:");
double small=dc.nextDouble();
System.out.println("drink containers holds more than 1 liter");
double large=dc.nextDouble();
double total=(small*0.10)+(large*0.25);
System.out.println("the total refund will be:$"+total);

}
}
