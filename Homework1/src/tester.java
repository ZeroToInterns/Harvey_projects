//for Student class
public class tester {

	public static void main(String[] args) {
		Student newStudent = new Student("Michale",2.1);
		System.out.println(newStudent.getName());
		//System.out.println("Name is setting to Harvey");
		newStudent.setName("Harvey");
		System.out.println(newStudent.getName());
		System.out.println(newStudent.getGPA());
		//System.out.println("GPA raised to 3.9");
		newStudent.changeGPA(3.9);
		System.out.println(newStudent.getGPA());
	}
	
}
