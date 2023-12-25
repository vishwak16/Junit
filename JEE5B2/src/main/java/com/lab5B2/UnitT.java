package com.lab5B2;
import java.sql.*;

public class UnitT {
public boolean logIn(String uname, String pass) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Vishwak@1234");
		String query = "select password from credentials where (username = '"+uname+"' );";
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(query); 
		String password;
		if(result.next()){
			   password = result.getString(1);
			}
		else {
			password = null;
		}
		con.close(); 
		return (pass.equals(password));
		
	}

}
	