
public class Person {

	private static String name;// declearing
	// allowing you to costumize every time you create a new Person 
	private static int age = 18;  // initializing
	private static char gender = 'M';
	private static double weight = 160.5;
	private static String hairColor = "Black";
	private static String height = "5'11";
	
	//the job of the constructor is to set the instance variable with initial values. 
	public Person(String theName) // give the instance variables initial values 
	//() = parameters what are the attributes to complete the codes
	{
		name = theName; // instance variables are attributes 
		// storing the local variable theName to name so we can access it everywhere 
	}
	
	public Person(String exName, String theHairColor)// the parameters must be different 
	{
		name = exName;
		hairColor = theHairColor;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String theNewName)
	{
		name = theNewName;
	}
	
	public String getHairColor()
	{
		return hairColor;
	}
	
	public void setHairColor(String theNewHairColor)
	{
		hairColor = theNewHairColor;
	}
	
	Person examplePerson = new Person("Example",  "Blue");
	
	public static void main(String[] args) {
		//creating a new Person
	Person newPerson = new Person("Michael");  //accessing all the instance variables from Person class 
	newPerson.age = 19;
	System.out.println(newPerson.age); //dot notation  update info in Person
	
	
	Person secondPerson = new Person("bro");  // creating a new person while inlitialzing 
	//Parameter does not match the parameter on top. 
	secondPerson.age = 21;
	System.out.println(secondPerson.age);
	
	String myString = "Hello"; // non primitive withour using new 
	Person thirdPerson = new Person("Broda"); 
	Person samePerson = thirdPerson; // not creating a new person but referring the same person created with third person 
	
	System.out.println(thirdPerson.name);
	
	}

}
