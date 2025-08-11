import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dep;
        int size=5;

        String[] dep = {"accounting", "personnel", "technical", "customer service", "marketing"};

        for ( Dep = 0; Dep <= size-1; Dep++) {
            System.out.println(dep[Dep]);

        }
    }
}