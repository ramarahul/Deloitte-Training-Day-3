package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.Load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver Not Found "+e.getMessage());
		}
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "hr";
		String password = "hr";
		Connection con = null;
		// 2.Get connection
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed. "+e.getMessage());
		}
		
		//3. Create a statement object
		
		String sql = "select department_name from departments";
		
		try {
			Statement st = con.createStatement();
			//4. Pass sql query string and execute statement
			ResultSet rs = st.executeQuery(sql);
			int noOfDepts=0;
			while(rs.next()) {
				String name = rs.getString("department_name");
				System.out.println(name);
				noOfDepts++;
			}
			System.out.println("The total number of departments are: "+noOfDepts);
			
			rs.close();
			st.close();
			con.close();
		}
		catch(SQLException sqle) {
			System.out.println(sqle.getMessage());
		}
	}

}
