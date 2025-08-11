import javax.swing.*;

public class Main {
        public static void main(String[] args) {


        String name;
        String surname;
        String studentNumber;
        String email;
        int mark1;
        int mark2;
        int assignmentMark;
        int examMark;
        double DpMark;
        double FinalMark;


        name = JOptionPane.showInputDialog("PLease enter student name:");
        JOptionPane.showMessageDialog(null,name);

        surname = JOptionPane.showInputDialog("Please enter student surname:");
        JOptionPane.showMessageDialog(null,surname);

        studentNumber = JOptionPane.showInputDialog("Please enter Student number:");
        JOptionPane.showMessageDialog(null,studentNumber);

        email = JOptionPane.showInputDialog("Please enter student email:");
        JOptionPane.showMessageDialog(null,email);




        mark1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter mark1:"));
        JOptionPane.showMessageDialog(null,mark1);

        mark2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter mark2:"));
        JOptionPane.showMessageDialog(null,mark2);

        assignmentMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter assignmentMark:"));
        JOptionPane.showMessageDialog(null,assignmentMark);

        examMark = Integer.parseInt(JOptionPane.showInputDialog("please enter examMark:"));
        JOptionPane.showMessageDialog(null, examMark);

        DpMark = Integer.parseInt( JOptionPane.showInputDialog("Please enter DpMark:"));
        JOptionPane.showMessageDialog(null, DpMark);

        FinalMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter FinalMar:"));
        JOptionPane.showMessageDialog(null,FinalMark);

        DpMark = (double) (mark1 + mark2 + assignmentMark)/3;
        JOptionPane.showMessageDialog(null, "your DpMark is " + DpMark);
        FinalMark = (DpMark*0.4) + (examMark*0.6);
        JOptionPane.showMessageDialog(null, "your final mark" + FinalMark);

    }
}