package model;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	void insertEmployee(Employee employee) throws SQLException;
	Employee selectEmployee(int id);
	List<Employee> selectAllEmployees();
	boolean deleteEmployee(int id) throws SQLException;
	boolean updateEmployee(Employee employee) throws SQLException;

}
