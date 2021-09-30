package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) {
		Connection con = null;
		
		
		//����̹��� �ε��ϴ� �۾� ���� ����
		try {
			//���� ����Ŭ����̹��� ����Ŭ ������ �����Ұž�
			Class.forName("oracle.jdbc.OracleDriver"); // �̰� �������־� Ʋ���� �ȵ�
														// ojdbc8 ����ִ��� ���� ������ ����
			//���� Ŀ������ �õ��Ұž�
			//localhost : ���� ��ǻ�� ����Ŭ ������ �� ��ǻ�Ϳ� �־�
			//1521 : �⺻��Ʈ �����ϴ� ��ΰ���
			//xe : SID name ����Ŭ ������ ���� �ٸ� �� �־� xe��� �ν��Ͻ��� �־�
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //�̰� �������־� @�޺κ��� �ٸ� �� �־�, Ʋ���� �ȵ�
			String user = "c##scott";										//�𺧷��� +���� ���� ���� ��
			String password = "tiger";										//ȣ��Ʈ �̸��ϰ� ��Ʈ ���� �־����
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("����Ǿ����ϴ�.");
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
