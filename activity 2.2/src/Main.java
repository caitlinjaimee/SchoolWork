import javax.swing.JOptionPane;

public class MarksCalculator{
    public static void main(String[]args){

        String input1 =JOptionPane.showInputDialog("enter mark1:");
        double Mark1=Double.parseDouble(input1);

        String input2 =JOptionPane.showInputDialog("enter mark2:");
        double Mark2=Double.parseDouble(input2);

        String input3 =JOptionPane.showInputDialog("enter assignment:");
        double AssignmentMark=Double.parseDouble(input3);

        String input4 =JOptionPane.showInputDialog("enter exam:");
        double ExamMark=Double.parseDouble(input4);

        double dpMark = (Mark1 + Mark2 + AssignmentMark)/ 3.0;
        double FinalMark = (dpMark * 0.4) + (ExamMark * 0.6);

        String result



    }
}