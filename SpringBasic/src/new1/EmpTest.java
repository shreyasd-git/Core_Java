package new1;

import Emp.pojo.Employee;
import Emp.pojo.EmployeeDAOImpl;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empObj = new Employee();

		EmployeeDAOImpl edi = new EmployeeDAOImpl();

		empObj.setEmpid(120);
		empObj.setEmpname("Design2");
		empObj.setEmpdept("karachi");

		edi.createEmployee(empObj);

//		Employee e = edi.readEmployee(10);
//		System.out.println("empid " + e.getEmpid());
//		System.out.println("empname " + e.getEmpname());
//		System.out.println("empemp " + e.getEmpdept());

		 //edi.updateEmployee(empObj);
		//ddi.deleteEmployee(50);

	}

}
