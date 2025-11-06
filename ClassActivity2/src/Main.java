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

    private JTextArea resultArea;

    private int dpMark = 0;  // Store DP mark for final calculation

    public Main() {
        setTitle("Student Results");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(7, 2, 10, 10));

        inputPanel.add(new JLabel("Enter student name:"));
        studentname = new JTextField();
        inputPanel.add(studentname);

        inputPanel.add(new JLabel("Enter student surname:"));
        studentsurname = new JTextField();
        inputPanel.add(studentsurname);

        inputPanel.add(new JLabel("Enter Mark1:"));
        mark1Field = new JTextField();
        inputPanel.add(mark1Field);

        inputPanel.add(new JLabel("Enter Mark2:"));
        mark2Field = new JTextField();
        inputPanel.add(mark2Field);

        inputPanel.add(new JLabel("Enter Assignment Mark:"));
        assignmentField = new JTextField();
        inputPanel.add(assignmentField);

        inputPanel.add(new JLabel("Enter Exam Mark:"));
        examField = new JTextField();
        inputPanel.add(examField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        calulateDpmark = new JButton("Calculate DpMark");
        calulateFinalmark = new JButton("Calculate FinalMark");

        buttonPanel.add(calulateDpmark);
        buttonPanel.add(calulateFinalmark);

        resultArea = new JTextArea(8, 40);
        resultArea.setEditable(false);
        resultArea.setBorder(BorderFactory.createTitledBorder("RESULTS: "));
        JScrollPane scrollPane = new JScrollPane(resultArea);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Action for Calculate DP Mark
        calulateDpmark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int mark1 = Integer.parseInt(mark1Field.getText());
                    int mark2 = Integer.parseInt(mark2Field.getText());
                    int assignment = Integer.parseInt(assignmentField.getText());

                    // Simple average for DP mark (you can change logic as needed)
                    dpMark = (mark1 + mark2 + assignment) / 3;

                    resultArea.setText("DP Mark for " + studentname.getText() + " " + studentsurname.getText() + ": " + dpMark);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers for all DP-related fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Action for Calculate Final Mark
        calulateFinalmark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int exam = Integer.parseInt(examField.getText());

                    // Final mark = 40% DP + 60% Exam (you can change weightings)
                    int finalMark = (int) ((dpMark * 0.4) + (exam * 0.6));

                    resultArea.setText("DP Mark: " + dpMark +
                            "\nExam Mark: " + exam +
                            "\nFinal Mark for " + studentname.getText() + " " + studentsurname.getText() + ": " + finalMark);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid exam mark.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}
