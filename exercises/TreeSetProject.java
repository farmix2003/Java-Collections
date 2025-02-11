
class Employee{
	private int id;
	private String fullNameString;
	private String departmentString;
	private double monthlySalary;
	
	public Employee(int id, String fullNameString, String departmentString, double monthlySalary) {
		super();
		this.id = id;
		this.fullNameString = fullNameString;
		this.departmentString = departmentString;
		this.monthlySalary = monthlySalary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullNameString() {
		return fullNameString;
	}
	public void setFullNameString(String fullNameString) {
		this.fullNameString = fullNameString;
	}
	public String getDepartmentString() {
		return departmentString;
	}
	public void setDepartmentString(String departmentString) {
		this.departmentString = departmentString;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}

public class TreeSetProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
