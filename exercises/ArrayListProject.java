import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Student{
	private int id;
	private String nameString;
	private double grade;
	
	public Student(int id, String nameString, double grade) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + ", grade=" + grade + "]";
	}
}

class StudentManager {
	private ArrayList<Student> students;
	
	public StudentManager() {
		students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		try {			
			if (!students.contains(student.getId())) {				
				students.add(student);
				System.out.println("Student added successfully");
			}else {
				System.out.println("Please use another number for id");
			}
		} catch (Exception e) {
		 System.out.println("Something went wrong");
		}
	}
	
   public void removeStudent(int id) {
	   students.removeIf(student -> student.getId() == id);
	   System.out.println("Student removed successfully");
   }
  
   public void displayAllStudents() {
	   if (students.isEmpty()) {
		System.out.println("No students available");
		return;
	}
	   for (Student student : students) {
		System.out.println(student);
	}
   }
   
   public void searchStudentById(int id) {
	   students.stream().
	   filter(student -> student.getId() == id).
	   forEach(student -> System.out.println("Student found with id "+student.getId()));
   }
   
   public void sortByName() {
	   System.out.println("Students sorted by name");
	   students.sort(Comparator.comparing(Student::getNameString));
   }
   
   public void sortByGrade() {
	   System.out.println("Students sorted by grade.");
	   students.sort(Comparator.comparing(Student::getGrade).reversed());
	   students.stream().forEach(System.out::println);
   } 
}


public class ArrayListProject {
   public static void main(String[] args) {
	StudentManager studentManager = new StudentManager();
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
		System.out.println("\n--- Student Management System ---");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Display All Students");
        System.out.println("4. Search Student by ID");
        System.out.println("5. Sort by Name");
        System.out.println("6. Sort by Grade");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
		case 1: 
			System.out.println("Enter ID: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter name: ");
			String nameString = scanner.nextLine();
			System.out.println("Enter grade: ");
			double grade = scanner.nextDouble();
			studentManager.addStudent(new Student(id, nameString, grade));
			break;
		case 2:
			System.out.println("Enter ID of student to remove: ");
			id = scanner.nextInt();
			studentManager.removeStudent(id);
			break;
		case 3:
			studentManager.displayAllStudents();
			break;
		case 4:
			System.out.println("Enter ID to search: ");
			id = scanner.nextInt();
			studentManager.searchStudentById(id);
			break;
		case 5:
			studentManager.sortByName();
			break;
		case 6:
			studentManager.sortByGrade();
			break;
		case 7:
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid choice. Please try again...");
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
}
