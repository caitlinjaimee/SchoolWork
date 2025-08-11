import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Name;
        String Surname;
        String StudentNo;
        String Email;

        short Mark1;
        short Mark2;
        short Assignment;
        short ExamMark;

        double DpMark;
        double FinalMark = 0;

        System.out.println("Please enter a student name:");
        Name = scanner.nextLine();
        System.out.println("Please enter a student Surname:");
        Surname = scanner.nextLine();
        System.out.println("Please enter a student student number:");
        StudentNo = scanner.nextLine();
        System.out.println("Please enter a student email:");
        Email = scanner.nextLine();

        System.out.println("enter your mark1");
        Mark1 = scanner.nextShort();
        System.out.println("enter your mark2");
        Mark2 = scanner.nextShort();
        System.out.println("enter your Assignment");
        Assignment = scanner.nextShort();
        System.out.println("enter your ExamMark");
        ExamMark = scanner.nextShort();

        if(FinalMark>=0 & FinalMark<=46)
        {
            System.out.println("final Mark:");
        }

    }
    public static double CalculateDpMark(short Mark1, short Mark2, short Assignment){
        return ((double) (Mark1+Mark2+Assignment)/3);
    }

    public static double CalculateFinalMark (double DpMark, short ExamMark){
        return  (double) ((DpMark * 0.4) + (ExamMark * 0.6));
    }

}