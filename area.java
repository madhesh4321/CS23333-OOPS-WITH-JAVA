import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the length of the field in feet: ");
        double length = a.nextDouble();
        System.out.print("Enter the width of the field in feet: ");
        double width = a.nextDouble();
        double areaInSquareFeet = length * width;
        double areaInAcres = areaInSquareFeet / 43560;
        System.out.println(areaInAcres + " acres");
        a.close();
    }
}
