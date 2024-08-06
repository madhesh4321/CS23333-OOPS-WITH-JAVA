import java.util.Scanner;
class CheckOddEven {
public static void main(String[] args) {
Scanner num = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = num.nextInt();
if (number % 2 != 0) {
System.out.println(2);
} else {
System.out.println(1);
}
num.close();
}
}
