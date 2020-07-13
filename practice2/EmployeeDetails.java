package practice2;

public class EmployeeDetails {
	private int empId;
	private  String empName;
	private String empDesig;
	private String empDept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpNmae() {
		return empName;
	}
	public void setEmpName(String empName) {
		try {	
			if(empName != null)
			   this.empName = empName;
			else
				this.empName ="";
		} catch (NullPointerException e) {
			System.out.println("null pointer Exception");
		}
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		String[] strArray= {"developer","tester","Lead or manager"};
		for(String str:strArray) {
			if(empDesig.equals(str)) {
				this.empDesig = empDesig;		
				return ;
			}
		}
		System.out.println("Invalid designation ");
	}
	public void setEmpDept(String empDept) {
		String[] strArray= {"TTH", "RCM", "Digital", "DevOps"};
		for(String str:strArray) {
			if(empDept.equals(str)) {		
				this.empDept = empDept;
				return ;
			}
		}
		System.out.println("Invalid dept ");
	}
	public String getEmpDept() {
		return empDept;
	}
	public EmployeeDetails(int empId,String empName,String empDesig,String empDept) {
		setEmpId(empId);
		setEmpName(empName);
		setEmpDesig(empDesig);
		setEmpDept(empDept);
	}
	@Override
	public String toString() {
		return empId+" "+empName+" "+empDesig+" "+empDept;
	}
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails(1000,null,"developer","TTH");
		System.out.println(emp);
		EmployeeDetails emp1 = new EmployeeDetails(1001,"ameeru","tester","Digital");
		System.out.println(emp1);
		//handled exception
//		System.out.println((emp1.empName).length());
	}
}
