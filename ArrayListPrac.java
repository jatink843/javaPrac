import java.util.*;
import java.lang.*;
class Student{
	

	// Private Fields.
	private String name;
	private String clas;
	private String rollNo;
	



	// The Constructor.
	public Student(String name, String clas, String roll){
		
		this.name = name;
		this.clas = clas;
		this.rollNo = roll;
	}

	// Some Public Methods.
	public void showName(){System.out.println("Name: "+this.name);}
	public void showClass(){System.out.println("Class: "+this.clas);}
	public void showRollNo(){System.out.println("Roll No.: "+this.rollNo);}


}


public class ArrayListPrac{


	public static void main(String arggs[]){
	
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Jatin", "SE-IT", "4217"));
		list.add(new Student("Atul", "12th", "Unknown"));
		list.add(new Student("ghost", "SE-IT", "nil"));
		list.add(new Student("jimmy", "nil", "nil"));

		for(Student stud : list){
		
			stud.showName();
		}
	
	}


}
