import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        int size=12;

        String[] Months = {"january", "february", "march", "april","may","june","july", "august", "september","october","november", "december"};

        for (month = 0; month <= size - 1; month++){
            System.out.println(Months[month]);
        }


    }
}