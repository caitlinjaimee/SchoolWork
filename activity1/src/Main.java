import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    double grossPay;
    int hours;
    int rate = 15;

    Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a number");


                hours = scanner.nextInt();
                grossPay = hours*rate;


            System.out.println("your grossPay is" + grossPay);


    }
}