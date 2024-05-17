package model;

public class EmployeeDAOImpl {
	private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employees (name, gender, phone, email, designation, salary) VALUES (?, ?, ?, ?, ?, ?);";
	private static final String SELECT_EMPLOYEE_BY_ID = "SELECT id, name, gender, phone, email, designation, salary FROM employees WHERE id = ?;";
	private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employees;";
	private static final String DELETE_EMPLOYEE_SQL = "DELETE FROM employees WHERE id = ?;";
	private static final String UPDATE_EMPLOYEE_SQL = "UPDATE employees SET name = ?, gender = ?, phone = ?, email = ?, designation = ?, salary = ? WHERE id = ?;";
	

}
