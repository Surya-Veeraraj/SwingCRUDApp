package ui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Employee;
import model.EmployeeDAO;
import model.EmployeeDAOImpl;

public class EmployeeTablePanel extends JPanel {
	private JTable table;
	private DefaultTableModel tableModel;
	private EmployeeDAO employeeDAO;

	public EmployeeTablePanel() {
		setLayout(new BorderLayout());
		
		employeeDAOimpl = new EmployeeDAOImpl();

		// Create table model with column names
		String[] columnNames = { "ID", "Name", "Gender", "Phone", "Email", "Designation", "Salary" };
		tableModel = new DefaultTableModel(columnNames, 0);

		// Create table with the default model
		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);

		add(scrollPane, BorderLayout.CENTER);
		
		populateTable();
	}

	// Method to populate the table with employee data
	public void populateTable() {
		clearTable(); // clear existing data
		for (Employee employee : employees) {
			Object[] rowData = { employee.getId(), employee.getName(), employee.getGender(), employee.getPhone(),
					employee.getEmail(), employee.getDesignation(), employee.getSalary() };
			tableModel.addRow(rowData);
		}
	}

	// Method to clear the table
	public void clearTable() {
		tableModel.setRowCount(0);
	}

	public JPanel getPanel() {
		return panel;
	}

}
