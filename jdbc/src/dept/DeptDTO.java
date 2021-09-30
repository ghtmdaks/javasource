package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//���̺� ���� �Ȱ��� �ۼ�
//������, getter, setter, toString

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	
}
