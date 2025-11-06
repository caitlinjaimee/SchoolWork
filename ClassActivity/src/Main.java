import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField studentname;
    private JTextField studentsurname;
    private JTextField mark1Field;
    private JTextField mark2Field;
    private JTextField assignmentField;
    private JTextField examField;

    private JButton calulateDpmark;
    private JButton calulateFinalmark;

    private JTextArea Result;

    //THE NAME OF THE METHOD MUST MATCH THE NAME OF THE FILE!!
    public Main(){
        setTitle("Student Results");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setLayout(new BorderLayout(10,10));

        JPanel InputPanel = new JPanel(new GridLayout(7,2,10,10));

        InputPanel.add(new JLabel("Enter student name:"));
        studentname= new JTextField();
        InputPanel.add(studentname);

        InputPanel.add(new JLabel("Enter student surname:"));
        studentsurname= new JTextField();
        InputPanel.add(studentsurname);

        InputPanel.add(new JLabel("Enter Mark1:"));
        mark1Field= new JTextField();
        InputPanel.add(mark1Field);

        InputPanel.add(new JLabel("Enter Mark2:"));
        mark2Field= new JTextField();
        InputPanel.add(mark2Field);

        InputPanel.add(new JLabel("Enter Assignment Mark:"));
        assignmentField= new JTextField();
        InputPanel.add(assignmentField);

        InputPanel.add(new JLabel("Enter Exam Mark:"));
        examField= new JTextField();
        InputPanel.add(examField);

        JPanel ButtonPanel = new JPanel(new FlowLayout());
        calulateDpmark = new JButton("Calculate DpMark");
        calulateFinalmark = new JButton("Calculate FinalMark");

        ButtonPanel.add(calulateDpmark);
        ButtonPanel.add(calulateFinalmark);

        Result = new JTextArea();
        Result.setEditable(false);

        Result.setBorder(BorderFactory.createTitledBorder("RESULTS: "));
        JScrollPane scrollPane = new JScrollPane(Result);

        add(InputPanel, BorderLayout.NORTH);
        add(ButtonPanel, BorderLayout.CENTER);
        add(Result, BorderLayout.SOUTH);


        calulateDpmark.addActionListener(new ActionListener() {
            public String calDpMark(){
                int dpmark;
                return null;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int mark1 = Integer.parseInt(mark1Field.getText());
                    int mark2 = Integer.parseInt(mark2Field.getText());
                    int assignment = Integer.parseInt(assignmentField.getText());
                    Result.setText(calDpMark());

                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "PLease try again.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        calulateFinalmark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int exam = Integer.parseInt(examField.getText());
                    int dpmark = Integer.parseInt(calulateDpmark.getText());


                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "PLease try again.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            new Main().setVisible(true);
        });
    }
}