import javax.swing.*;

public class EmployeeMain {
    public static JFrame EmployeeTestFrame;

    public static void main(String[] args) {
        EmployeeTest ETObject = new EmployeeTest();

        EmployeeTestFrame = new JFrame("Employee Test");
        EmployeeTestFrame.setContentPane(ETObject.EmpTestPanel);
        EmployeeTestFrame.setVisible(true);
        EmployeeTestFrame.pack();
        EmployeeTestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EmployeeTestFrame.setSize(500, 250);
        EmployeeTestFrame.setLocationRelativeTo(null);
        EmployeeTestFrame.setResizable(false);
    }
}
