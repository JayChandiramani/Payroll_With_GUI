import javax.swing.*;

public class Employee {
    String name;
    int age;
    String designation;
    double hours, nPay, oPay, tPay;
    double overtimePay = 2, normalCEOPay = 7.20, normalManagerPay = 6.00, normalSalesPersonPay = 5.43, normalCashierPay = 5.43, nHours, oHours;

    // This is the constructor of the class Employee.
    public Employee(String name){
        this.name = name;
    }

    // Assign the age of the Employee to the variable age.
    public void empAge(int empAge){
        age = empAge;
    }

    // Assign the designation to the variable designation.
    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    // Assign the salary to the variable salary.
    public void empHours(double empHours){
        hours = empHours;
    }

    //Calculate the overall salary of the employee.
    public void calculatePay(String employeeDesignation ,Double empWorkHours){
        if (employeeDesignation.equals("Chief Executive Officer")){
            if (empWorkHours > 40){
                oPay = (empWorkHours - 40)*overtimePay;
                nPay = 40*normalCEOPay;
            }
            else{
                oPay = 0;
                nPay = empWorkHours * normalCEOPay;
            }
            tPay = nPay + oPay;
        }

        if (employeeDesignation.equals("Manager")){
            if (empWorkHours > 40){
                oPay = (empWorkHours - 40)*overtimePay;
                nPay = 40*normalManagerPay;
            }
            else{
                oPay = 0;
                nPay = empWorkHours * normalManagerPay;
            }
            tPay = nPay + oPay;
        }

        if (employeeDesignation.equals("Sales Person")){
            if (empWorkHours > 40){
                oPay = (empWorkHours - 40)*overtimePay;
                nPay = 40*normalSalesPersonPay;
            }
            else{
                oPay = 0;
                nPay = empWorkHours * normalSalesPersonPay;
            }
            tPay = nPay + oPay;
        }

        if (employeeDesignation.equals("Cashier")){
            if (empWorkHours > 40){
                oPay = (empWorkHours - 40)*overtimePay;
                nPay = 40*normalCashierPay;
            }
            else{
                oPay = 0;
                nPay = empWorkHours * normalCashierPay;
            }
            tPay = nPay + oPay;
        }
    }

    //Calculate the different types of hours.
    public void calculateHours(Double empWorkingHours){
        if (empWorkingHours > 40){
            nHours = 40;
            oHours = empWorkingHours - 40;
        }
        else {
            nHours = empWorkingHours;
            oHours = 0;
        }
    }

    // Print the employee details.
    public void printEmployee(){
        JOptionPane.showMessageDialog(null, "Name: " + name + "\nAge: " + age + " years" + "\nDesignation: " + designation + "\nTotal Hours: " + hours + " hours" + "\nNormal Hours: " + nHours + " hours" + "\nOvertime Hours: "+ oHours + " hours" + "\nNormal Pay: " + nPay + "\nOvertime Pay: " + oPay + "\nTotal Pay: " + tPay);
    }
}
