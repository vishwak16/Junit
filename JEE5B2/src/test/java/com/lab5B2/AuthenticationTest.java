package com.lab5B2;
import org.junit.*;
import java.sql.*;

public class AuthenticationTest {
	@Test
	public void testcase_1() throws SQLException{
		
		UnitT app = new UnitT();

		Assert.assertEquals(true, app.logIn("user1", "1"));
	}
	
	@Test
	public void testcase_2() throws SQLException{
		
		UnitT app = new UnitT();
		
		Assert.assertEquals(true, app.logIn("user2", "2"));
	}
}