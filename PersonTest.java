import java.util.*;
public class PersonTest {
	public static void main(String[] args) {
		Course cse101 = new Course("Introduction to Java 1"); 
		Course cse102 = new Course("Introduction to Java 2"); 
		Course cse121 = new Course("Introduction to OOP 1"); 
		Course cse122 = new Course("Introduction to OOP 2");
		
		Person student1 = new Student("Bear F.");
		((Student)student1).addCourse(cse101); 
		System.out.println(student1);
		Student student2 = new Student("Whale G.", Student.SOPHOMORE); 
		student2.addCourse(cse101);
		student2.addCourse(cse121);
		System.out.println(student2);
		student2.dropCourse(cse101); 
		System.out.println(student2);
		Person employee1 = new Employee("Panda Q."); 
		System.out.println(employee1);
		Person faculty1 = new Faculty("Anteater P."); 
		System.out.println(faculty1);
		Student student3 = new Student("Elephant M.", Student.SENIOR);
		student3.addCourse(cse102);
		student3.addCourse(cse122);
		student3.addCourse(cse101);
		Faculty faculty2 = new Faculty("Llama I.", Faculty.ASSISTANT_PROFESSOR); 
		faculty2.addCourse(cse122);
		faculty2.addCourse(cse121);
		System.out.println(faculty2);
		student3.dropCourse(cse101);
		faculty2.cancelCourse(cse122); 
		System.out.println(faculty2);
		Person staff1 = new Staff("Goose T."); 
		System.out.println(staff1);
		Staff staff2 = new Staff("Mammoth W.", "Director"); 
		System.out.println(staff2);
		System.out.println(student3);
	}
}

class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	public Person(String name) {this.name = name;}
	public String getName() {return name;}
	public String toString() {
		return "Person: " + name;
	}
}

class Employee extends Person{
	private String office;
	private double Salary;
	private Date dateHired = new Date();
	public Employee(String name) {
		super(name);
		Date dateHired = new Date();
	}
	public String toString() {
		return super.toString() +  " Hired on " + dateHired;
	}
}

class Student extends Person{
	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	private int status;
	ArrayList<Course> courseTaking = new ArrayList<>();
	public Student(String name) {super(name);}
	public Student(String name, int status) {
		super(name);
		this.status = status;
	}
	public void addCourse(Course c) {
		courseTaking.add(c);
	}
	public void dropCourse(Course c) {
		courseTaking.remove(c);
	}
	public ArrayList<Course> getCourseTaking(){
		return courseTaking;
	}
	public String toString() {
		return "Student: " + super.getName() + " " + status + " " + getCourseTaking();
	}
}

class Faculty extends Employee{
	public int rank;
	public static final int LECTURER = 1;
	public static final int ASSISTANT_PROFESSOR = 2;
	public static final int ASSOCIATE_PROFESSOR = 3;
	public static final int PROFESSOR = 4;
	ArrayList<Course> courseTeaching = new ArrayList<>();
	public Faculty(String name) {super(name);}
	public Faculty(String name, int rank) {
		super(name);
		this.rank = rank;
	}
	public void addCourse(Course c) {
		courseTeaching.add(c);
	}
	public void cancelCourse(Course c) {
		courseTeaching.remove(c);
	}
	public ArrayList<Course> getCourseTeaching(){
		return courseTeaching;
	}
	public String toString() {
		return "Faculty: " + super.getName() + " " + rank + " " + super.toString() + " " + getCourseTeaching();
	}
}

class Staff extends Employee{
	public String title;
	public Staff(String name) {super(name);}
	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}
	public String toString() {
		return "Staff: " + super.getName() + " " + super.toString() + " " + "Title: " + title;
	}
}

class Course {
	private String courseName;
	private ArrayList<Student> students = new ArrayList<>();
	private int numberOfStudents;
	
	public Course(String courseName) { this.courseName = courseName;} 
	public String getCourseName() { 
		return courseName; 
	}
	
	public void addStudent(Student student) {
		students.add(student);
		numberOfStudents++;
	}
	
	public void dropStudent(Student student) {
		students.remove(student);
		numberOfStudents--;
	} 

	public ArrayList<Student> getStudents() { 
		return students;
	}
	
	
	public int getNumberOfStudents() { 
		return numberOfStudents; 
	}
	
	public void clear() {
		students.clear();
		numberOfStudents = 0;
	}
	
	public String toString() {
		return courseName;
	}
}