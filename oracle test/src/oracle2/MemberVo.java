package oracle2;
public class MemberVo{
		private String empno;
		private String ename;
		private int sal;

		
		
		public MemberVo() {
			
		}
		public MemberVo (String empno,String ename,int sal){
			this.empno = empno;
			this.ename = ename;
			this.sal = sal;
		
		}
		public String getEmpno() {
			return empno;
		}
		public String getEname() {
			return ename;
		}
		public int getSal() {
			return sal;
		}
//		public int getcomm() {
//			return comm;
//		}
//		public int gettotal() {
//			return total;
//		}
	}


