import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Task{
	private int id;
	private String title;
	private String descriptionString;
	private String priorityString;
	
	
	public Task(int id, String title, String descriptionString, String priorityString) {
		super();
		this.id = id;
		this.title = title;
		this.descriptionString = descriptionString;
		this.priorityString = priorityString;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescriptionString() {
		return descriptionString;
	}
	public void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}
	public String getPriorityString() {
		return priorityString;
	}
	public void setPriorityString(String priorityString) {
		this.priorityString = priorityString;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", descriptionString=" + descriptionString + ", priorityString="
				+ priorityString + "]";
	}
	
}


class TaskManager {
	private List<Task> tasks;
	private int taskIdCounter = 1;
	
	public TaskManager() {
		tasks = new LinkedList<>();
	}
	
	public void addTask(String titleString, String descString, String priorityString) {
		Task task = new Task(taskIdCounter, titleString, descString, priorityString);
		tasks.add(task);
		System.out.println("Task added successfully");
	}
	
	public void removeTask(int id) {
		tasks.removeIf(task -> task.getId() == id);
		System.out.println("Task removed successfully");
	}
	
	public void updateTask(Integer id, String titleString, String descString, String priorityString) {
		for (Task task : tasks) {
			if (task.getId() == id) {
				task.setTitle(titleString);
				task.setDescriptionString(descString);
				task.setPriorityString(priorityString);
				System.out.println("Task updated successfully!");
				return;
			}
		}
		System.out.println("Task with id "+id+" not found");
	}
	
	public void displayTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks available");
			return;
		}
		tasks.forEach(System.out::println);
	}
	
	public void sortByPriorityHighToLow() {
		tasks.sort(Comparator.comparing(Task::getPriorityString));
		tasks.forEach(System.out::println);
		System.out.println("Tasks sorted by priority high to low");
	}
	
	public void sortedByPriorityLowToHigh() {
		tasks.sort(Comparator.comparing(Task::getPriorityString).reversed());
		tasks.forEach(System.out::println);
		System.out.println("Tasks sorted by priority low to high");
	}	
}

public class LinkedListProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		TaskManager taskManager = new TaskManager();
		Scanner scanner = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);
		while(true) {
			 System.out.println("\n--- Task Manager ---");
	            System.out.println("1. Add Task");
	            System.out.println("2. Remove Task");
	            System.out.println("3. Update Task");
	            System.out.println("4. Display All Tasks");
	            System.out.println("5. Sort Tasks by Priority High to Low");
	            System.out.println("6. Sort Tasks by Priority Low to High");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            
	         int choice = scanner.nextInt();
	         
	         switch(choice) {
	           case 1:
	        	   System.out.print("Enter Title: ");
                   String title = stringScanner.nextLine();
                   System.out.print("Enter Description: ");
                   String description = stringScanner.nextLine();
                   System.out.print("Enter Priority (High, Medium, Low): ");
                   String priority = stringScanner.nextLine();
                   taskManager.addTask(title, description, priority);
                   break;
	           case 2:
	        	   System.out.println("Enter id to remove Task");
	        	   int id = scanner.nextInt();
	        	   taskManager.removeTask(id);
	        	   break;
	           case 3:
	        	   System.out.print("Enter Task ID to update: ");
                   id = scanner.nextInt();
                   scanner.nextLine();
                   System.out.print("Enter New Title: ");
                   String newTitle = stringScanner.nextLine();
                   System.out.print("Enter New Description: ");
                   String newDescription = stringScanner.nextLine();
                   System.out.print("Enter New Priority (High, Medium, Low): ");
                   String newPriority = stringScanner.nextLine();
                   taskManager.updateTask(id, newTitle, newDescription, newPriority);
                   break;
               case 4:
            	   taskManager.displayTasks();
            	   break;
               case 5:
            	   taskManager.sortByPriorityHighToLow();
            	   break;
               case 6:
            	   taskManager.sortedByPriorityLowToHigh();
            	   break;
               case 7:
            	   System.out.println("Exiting...");
            	   scanner.close();
            	   return;
               default:
            	   System.out.println("Invalid choice!! Please try again.");
	         }
		}
   
	}

}
