package Emp.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection
{
	static Connection connRef; //null by default
	
	private MyConnection() { 
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("registerd......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection connect() {
		if(connRef ==null) {
			try {
				connRef = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","shreyas");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connRef;
	}
}

