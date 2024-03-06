import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeTest {
    private JTextField NameTF;
    private JTextField AgeTF;
    private JComboBox DesignationTF;
    private JSpinner HoursJS;
    private JButton okayButton;
    private JButton cancelButton;
    public JPanel EmpTestPanel;
    private JFormattedTextField Title;


    public EmployeeTest() {
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        okayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (NameTF.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Please input a name.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                else{
                    if (AgeTF.getText().equals(""))
                        JOptionPane.showMessageDialog(null, "Please input an age.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    else{
                        if (DesignationTF.getSelectedItem().toString().equals("Please Select One."))
                            JOptionPane.showMessageDialog(null, "Please input a designation.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                        else{
                            if (HoursJS.getValue().toString().equals(""))
                                JOptionPane.showMessageDialog(null, "Please input a Salary.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                            else{
                                Employee empOne = new Employee(NameTF.getText());
                                empOne.empAge(Integer.parseInt(AgeTF.getText()));
                                empOne.empDesignation(DesignationTF.getSelectedItem().toString());
                                empOne.empHours(Double.parseDouble(HoursJS.getValue().toString()));
                                empOne.calculatePay(DesignationTF.getSelectedItem().toString(), Double.parseDouble(HoursJS.getValue().toString()));
                                empOne.calculateHours(Double.parseDouble(HoursJS.getValue().toString()));
                                empOne.printEmployee();
                            }
                        }
                    }
                }
            }
        });
    }
}
