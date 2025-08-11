import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double majorRadius;
        double minorRadius;
        double area;
        double pi=3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter majorRadius");
        majorRadius= scanner.nextDouble();

        System.out.println("please enter minorRadius");
        minorRadius= scanner.nextDouble();

        area=pi * minorRadius * majorRadius;

        System.out.println("Area is"+area);

    }
}