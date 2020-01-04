import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class EmpNameDisplayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayName(182);
		System.out.println(displaySal("Martha"));
	}
	
	private static double displaySal(String name) {
		// TODO Auto-generated method stub
		Connection con = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr").getConnection();
		String sql = " {call giveSal(?,?)}";
		try {
			CallableStatement cst = con.prepareCall(sql);
			cst.setString(1,name);
			cst.registerOutParameter(2,Types.DOUBLE);
			cst.execute();
			return cst.getInt(2);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public static void displayName(int id) {
		
		Connection con = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr").getConnection();
		String sql = " {call giveName(?,?)}";
		try {
			CallableStatement cst = con.prepareCall(sql);
			cst.setInt(1,id);
			cst.registerOutParameter(2,Types.VARCHAR);
			cst.execute();
			System.out.println(cst.getString(2));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
