import java.util.Scanner;
class days{
public static void main(String [] args){
Scanner day=new Scanner(System.in);
System.out.println("Enter the no.of days:");
int d=day.nextInt();
int year=d/365;
int r_days=d%365;
int months=r_days/30;
int n_days=r_days%30;
System.out.println("years="+year+" months:"+months+" days:"+n_days);
}
}