package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//테이블 모양과 똑같이 작성
//생성자, getter, setter, toString

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
