
public class Student {
	private static String name;
	private static double GPA;
	public Student(String theName, double TheGPA)
	{	
		name = theName;
		GPA = TheGPA;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public double getGPA()
	{
		return GPA;
	}
	public void changeGPA(double newGPA)
	{
		GPA = newGPA;
	}
}
