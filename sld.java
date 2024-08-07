import java.util.Scanner;
class sld{
public static void main(String [] args){
Scanner tl=new Scanner(System.in);
System.out.println("Enter a number:");
int number = tl.nextInt();
number = Math.abs(number);
if (number < 10) {
System.out.println(-1);
} else {
int secondLastDigit = (number / 10) % 10;
System.out.println(secondLastDigit);
}
}
}