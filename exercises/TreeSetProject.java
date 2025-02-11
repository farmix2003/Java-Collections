import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
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


	@Override
	public int compareTo(Employee o) {
		
		return Integer.compare(this.id, o.id);
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullNameString + ", department=" + departmentString
				+ ", monthlySalary=" + monthlySalary + "]";
	}
	
	
}

class EmployeeManager {
	
	TreeSet<Employee> employees;
	
	public EmployeeManager() {
		employees = new TreeSet<>();
	}
	
	public void addEmpolyee(int id, String fullName, String department, double monthlySalary) {
		Employee newEmployee = new Employee(id, fullName, department, monthlySalary);
		if (employees.add(newEmployee)) {
         System.out.println("Employee added successfully");
		}else {			
			System.out.println("Employee with id "+id+" already exists");
		}
	}
	
	public void removeEmployee(int id) {
		employees.removeIf(employee -> employee.getId() == id);
		System.out.println("Employee removed successfully!");
	}
	
	public void searchEmploye(int id) {
		employees.forEach(e -> {
	    if (e.getId() == id) {
		System.out.println("Employee found "+e);
	    }else {
	    	System.out.println("Employee with ID " + id + " not found.");
	    }			
		});
	}
	
	public void displayAllEmployees() {
		if(employees.isEmpty()) {
			System.out.println("No employee available");
		return;
		}
		System.out.println("Employee List:");
		employees.forEach(System.out::println);
	}
	
}

public class TreeSetProject {

	 public static void main(String[] args) {
	        EmployeeManager manager = new EmployeeManager();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Employee Manager ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Remove Employee");
	            System.out.println("3. Search Employee");
	            System.out.println("4. Display All Employees");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); 
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Department: ");
	                    String department = scanner.nextLine();
	                    System.out.println("Enter monthly salary:");
	                    Double salary = scanner.nextDouble();
	                    manager.addEmpolyee(id, name, department, salary);
	                    break;

	                case 2:
	                    System.out.print("Enter Employee ID to remove: ");
	                    id = scanner.nextInt();
	                    manager.removeEmployee(id);
	                    break;

	                case 3:
	                    System.out.print("Enter Employee ID to search: ");
	                    id = scanner.nextInt();
	                    manager.searchEmploye(id);
	                    break;

	                case 4:
	                    manager.displayAllEmployees();
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

}
