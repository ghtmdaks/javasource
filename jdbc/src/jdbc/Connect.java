package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) {
		Connection con = null;
		
		
		//드라이버를 로드하는 작업 부터 시작
		try {
			//나는 오라클드라이버로 오라클 서버랑 연동할거야
			Class.forName("oracle.jdbc.OracleDriver"); // 이거 정해져있어 틀리면 안돼
														// ojdbc8 어디있는지 몰라서 오류가 떴어
			//이제 커낵션을 시도할거야
			//localhost : 본인 컴퓨터 오라클 서버가 내 컴퓨터에 있어
			//1521 : 기본포트 접속하는 통로개념
			//xe : SID name 오라클 버전에 따라 다를 수 있어 xe라는 인스턴스가 있어
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //이거 정해져있어 @뒷부분은 다를 수 있어, 틀리면 안돼
			String user = "c##scott";										//디벨로퍼 +만들어서 접속 누를 때
			String password = "tiger";										//호스트 이름하고 포트 따서 넣어야해
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("연결되었읍니다.");
			}
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
