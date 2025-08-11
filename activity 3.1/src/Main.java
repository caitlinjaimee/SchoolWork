import javax.swing.JOptionPane;

public class Main{
    public static void main(String[]args){

        int count = 0;
        while(count< 5) {
            JOptionPane.showInputDialog(
                    null, "enter number");
            
            count++;

        }
    }
}