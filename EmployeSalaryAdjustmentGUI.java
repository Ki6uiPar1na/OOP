import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Employe {
    int uniqueID;
    String employeName;
    double initialSalary;

    Employe(int uniqueID, String employeName, double initialSalary) {
        this.uniqueID = uniqueID;
        this.employeName = employeName;
        this.initialSalary = initialSalary;
    }

    @Override
    public String toString() {
        return "Unique ID: " + uniqueID + "\nName: " + employeName + "\nSalary: " + initialSalary;
    }
}

public class EmployeSalaryAdjustmentGUI {
    private static ArrayList<Employe> employes = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Salary Adjustment");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel idLabel = new JLabel("Unique ID:");
        JTextField idField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel salaryLabel = new JLabel("Initial Salary:");
        JTextField salaryField = new JTextField();
        
        JButton addEmployeeButton = new JButton("New Employee Entry");
        JButton addSalaryButton = new JButton("Add Salary");
        JButton adjustSalaryButton = new JButton("Adjust Salary");
        JButton printInfoButton = new JButton("Print Employee Information");
        
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(addEmployeeButton);
        panel.add(addSalaryButton);
        panel.add(adjustSalaryButton);
        panel.add(printInfoButton);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
        
        addEmployeeButton.addActionListener(e -> {
            int uniqueID = Integer.parseInt(idField.getText());
            String employeName = nameField.getText();
            double initialSalary = Double.parseDouble(salaryField.getText());
            Employe newEmploye = new Employe(uniqueID, employeName, initialSalary);
            employes.add(newEmploye);
            outputArea.append("Employee Entry successfully done!\n");
        });

        addSalaryButton.addActionListener(e -> {
            int uniqueID = Integer.parseInt(idField.getText());
            Employe employe = findEmploye(employes, uniqueID);
            if (employe != null) {
                double addMoney = Double.parseDouble(salaryField.getText());
                employe.initialSalary += addMoney;
                outputArea.append("Salary added successfully.\n");
            } else {
                outputArea.append("Enter correct unique ID number.\n");
            }
        });

        adjustSalaryButton.addActionListener(e -> {
            int uniqueID = Integer.parseInt(idField.getText());
            Employe employe = findEmploye(employes, uniqueID);
            if (employe != null) {
                double percentage = Double.parseDouble(salaryField.getText());
                employe.initialSalary += employe.initialSalary * (percentage / 100);
                outputArea.append("Salary adjusted successfully.\n");
            } else {
                outputArea.append("Enter correct unique ID number.\n");
            }
        });

        printInfoButton.addActionListener(e -> {
            int uniqueID = Integer.parseInt(idField.getText());
            Employe employe = findEmploye(employes, uniqueID);
            if (employe != null) {
                outputArea.append(employe.toString() + "\n");
            } else {
                outputArea.append("Enter correct unique ID number.\n");
            }
        });

        frame.setVisible(true);
    }

    public static Employe findEmploye(ArrayList<Employe> employes, int uniqueID) {
        for (Employe employe : employes) {
            if (employe.uniqueID == uniqueID) {
                return employe;
            }
        }
        return null;
    }
}
