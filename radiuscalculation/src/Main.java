import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        int majorRadius;
        int minorRadius;
        double pi=3.14;
        double area;


        majorRadius = Integer.parseInt(JOptionPane.showInputDialog("enter majorRadius"));
        JOptionPane.showMessageDialog(null,majorRadius);

        minorRadius =Integer.parseInt(JOptionPane.showInputDialog("enter minorRadius"));
        JOptionPane.showMessageDialog(null,minorRadius);


    }
}