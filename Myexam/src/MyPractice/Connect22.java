package MyPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect22 {
public static void main(String[] args) {
	
	Connection  con = null;
	try {
		//드라이버 로드 
		Class.forName("oracle.jdbc.OracleDriver");
		
		//연결 시도 java.sql 로 get부터는 세개짜리 선택
		//@125.132.75.187  본인 컴퓨터 정보
		String url ="jdbc:oracle:thin:@125.132.75.187:1521:xe";
		String user ="c##scott";
		String password ="tiger";
		con = DriverManager.getConnection(url, user, password);
		
		if(con!=null) {
			System.out.println("연결되었습니다");
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}//여기까지는 api에 접속할수 있는 드라이브를 정해주는거임(여기는 오라클 dvs연결함) 
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
