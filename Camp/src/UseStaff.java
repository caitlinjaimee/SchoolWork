import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UseStaff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int StaffNumber;
        String Stafflocation;


        System.out.println("Please enter Staff number: ");
        StaffNumber = scanner.nextInt();
        System.out.println("Please enter Staff Location: ");
        Stafflocation = scanner.nextLine();

        StaffHiring staffhiring = new StaffHiring(StaffNumber,Stafflocation);
        staffhiring.PrintHiringProcess();
    }
}