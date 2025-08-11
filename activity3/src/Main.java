import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while(count< 5) {
            System.out.print("enter a number:");
            scanner.nextDouble();
            count++;

        }
    }
}