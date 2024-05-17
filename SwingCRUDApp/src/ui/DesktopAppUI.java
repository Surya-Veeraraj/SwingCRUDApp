package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DesktopAppUI extends JFrame {
    private JLabel nameLabel, genderLabel, phoneLabel, emailLabel, designationLabel, salaryLabel;
    private JTextField nameField, phoneField, emailField, designationField, salaryField;
    private JComboBox<String> genderComboBox;
    private JButton addButton, updateButton, deleteButton;
    private JTable dataTable;

    public DesktopAppUI() {
        setTitle("Employee Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel entry = createEntryPanel();

        JPanel view = new JPanel();
        view.add(getViewPanel());

        tabbedPane.add("Entry", entry);
        tabbedPane.add("View", view);

        add(tabbedPane, BorderLayout.CENTER);

    }

    private JPanel createEntryPanel() {
        JPanel entryPanel = new JPanel(null);
        int x = 30;
        int y = 10;
        int width = 180;
        int height = 25;
        int xAxisGap = 10;
        int yAxisGap = 25;

        // Add name label and field
        y += height + yAxisGap;
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(x, y, width, height);
        entryPanel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(nameLabel.getX() + nameLabel.getWidth() + xAxisGap, y, width, height);
        entryPanel.add(nameField);

        y += height + yAxisGap;
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(x, y, width, height);
        entryPanel.add(genderLabel);

        genderComboBox = new JComboBox<String>();
        genderComboBox.setBounds(genderLabel.getX() + genderLabel.getWidth() + xAxisGap, y, width, height); 
        genderComboBox.addItem("Female");
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Others");
        genderComboBox.setSelectedIndex(-1);
        entryPanel.add(genderComboBox); 

        y += height + yAxisGap;
        phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(x, y, width, height);
        entryPanel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(phoneLabel.getX() + phoneLabel.getWidth() + xAxisGap, y, width, height);
        entryPanel.add(phoneField);

        y += height + yAxisGap;
        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(x, y, width, height);
        entryPanel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(emailLabel.getX() + emailLabel.getWidth() + xAxisGap, y, width, height);
        entryPanel.add(emailField);

        y += height + yAxisGap;
        designationLabel = new JLabel("Designation:");
        designationLabel.setBounds(x, y, width, height);
        entryPanel.add(designationLabel);

        designationField = new JTextField();
        designationField.setBounds(designationLabel.getX() + designationLabel.getWidth() + xAxisGap, y, width, height);
        entryPanel.add(designationField);

        y += height + yAxisGap;
        salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(x, y, width, height);
        entryPanel.add(salaryLabel);

        salaryField = new JTextField();
        salaryField.setBounds(salaryLabel.getX() + salaryLabel.getWidth() + xAxisGap, y, width, height);
        entryPanel.add(salaryField);

        x += 20;
		width = 100;
		xAxisGap = 40;
		
        y += height + yAxisGap;
        addButton = new JButton("Add");
        addButton.setBounds(x, y, width, height);
        entryPanel.add(addButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(addButton.getX() + addButton.getWidth() + xAxisGap, y, width, height);
        entryPanel.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(updateButton.getX() + updateButton.getWidth() + xAxisGap, y, width, height);
        entryPanel.add(deleteButton);

        return entryPanel;
    }

    private JPanel getViewPanel() {
        JPanel viewPanel = new JPanel();

        JLabel viewLabel = new JLabel("This is the view panel.");
        viewPanel.add(viewLabel);

        return viewPanel;

    }
}
