package dept;

import java.sql.Connection;
import java.sql.DriverManager;

import com.sun.xml.internal.ws.Closeable;

public class DeptDAO {
	//empdao static,Connection
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@125.132.75.187:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;
		try {
			con= DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
				e.printStackTrace();
 		}

	return con;
}

}
