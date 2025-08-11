

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                    int value;
                    int total=0;
                    int count=0;

            while (count < 2) {
                System.out.println("Insert two values");
                value = scanner.nextInt();
                total += value;
                count ++;
            }
        System.out.println("Total is" + total);
    }
}