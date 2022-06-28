package Emp.pojo;

public interface EmployeeDAO {
	// CRUD
	
	void createEmployee(Employee ref);
	
	Employee readEmployee(int Empid);
	
	void updateEmployee(Employee ref);
	
	void deleteEmployee(int Empid);
}
