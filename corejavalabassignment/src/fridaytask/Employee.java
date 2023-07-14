package fridaytask;

public class Employee extends Person {
	private int EmployeeId;
	private double salary;
	public Employee( int employeeId, double salary) {
		
		EmployeeId = employeeId;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", salary=" + salary + "]";
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
