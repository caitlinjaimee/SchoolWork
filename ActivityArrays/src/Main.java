//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] students = new int[10];
        for (int i = 0; 1 <= students.length - 1; i++) {
            System.out.println("please enter marks for 10 students");
            students[i] = scanner.nextInt();


        }
        System.out.println("the mark is:" + Arrays.toString(students));

    }
}