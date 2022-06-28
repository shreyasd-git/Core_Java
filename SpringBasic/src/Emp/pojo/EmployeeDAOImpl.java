package Emp.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import emp.pojo.Department;

public class EmployeeDAOImpl implements  EmployeeDAO {
	Connection conn;
	
	public EmployeeDAOImpl() {
		conn = MyConnection.connect();
	}

	@Override
	public void createEmployee(Employee ref) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = conn.prepareStatement("insert into emp values (?,?,?)");
			pst.setInt(1, ref.getEmpid());
			pst.setString(2, ref.getEmpname());
			pst.setString(3, ref.getEmpdept());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Override
	public Employee readEmployee(int Empid) {
		// TODO Auto-generated method stub

		Employee emp = null;

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp WHERE empid="  + Empid);
			if (rs.next()) {
				emp = new Employee(); // blank object
				emp.setEmpid(rs.getInt(1));
				emp.setEmpname(rs.getString(2));
				emp.setEmpdept(rs.getString(3));
			} else {
				throw new RuntimeException("Data not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;

	}

	@Override
	public void updateEmployee(Employee ref) {
		// TODO Auto-generated method stub

		try {
			PreparedStatement pst = conn.prepareStatement("UPDATE emp SET  empdept='Chaprasi' WHERE empid=120");
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(int Empid) {
		// TODO Auto-generated method stub

		try {
			PreparedStatement pst = conn.prepareStatement("DELETE FROM dept WHERE dno=50");
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
