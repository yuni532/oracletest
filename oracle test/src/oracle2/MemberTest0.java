package oracle2;
import java.util.ArrayList;

public class MemberTest0 {

	public static void main(String[] args) {
	MemberDAO1 dao = new MemberDAO1();
	ArrayList<MemberVo> list = dao.list();
	
	for(int i =0; i<list.size();i++) {
		MemberVo data = (MemberVo) list.get(i);
		String empno = data.getEmpno();
		String ename = data.getEname();
		int sal = data.getSal();
		int comm = data.getcomm();
		int total = data.gettotal();
		
		System.out.println(empno + " : " + ename + " : " + sal+ " : "+ comm + " : "+ total);
	}

	}
}