package employee;

public class Employee extends Company {

	public String empName;
	public int id;
	
	public Employee(String empName,int id,String cn)
	{
		super(cn);
		this.empName=empName;
		this.id=id;
	}
	
	public static void main(String[] args) {

		Employee e=new Employee("suraj",10, "Alto");
		System.out.println(e.companyName+"  "+ e.empName+"   "+e.id);
	}

}
