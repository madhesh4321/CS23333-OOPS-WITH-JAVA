import java.util.Scanner;
class retailer{
public static void main(String[]arys){
Scanner products=new Scanner(System.in);
System.out.println("enter the weighs of the widget:");
int numwidget=products.nextInt();
System.out.println("enter the weighs of the gizmos:");
int numgizmos=products.nextInt();
int totalweight=(numwidget*75)+(numgizmos*112);
System.out.println("the total weight of widget and gizmos is:"+ totalweight);
products.close();
}
}