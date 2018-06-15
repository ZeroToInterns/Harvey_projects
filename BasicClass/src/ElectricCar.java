
public class ElectricCar {

	private int maxRange;
	private int currentRange;
	private String make;
	//constructor
	public ElectricCar(String make, int theMaxRange)
	{
		currentRange = 0;
		maxRange = theMaxRange;
		this.make = make; // make the instance variable equal to the local String make
	}
	//Charges the ElectricCar to its maximum range. It can not be charged above the maximum.
	public void charge()
	{
		currentRange = maxRange;
	}
	//Drives the car the specified distance. This reduces the current range. 
	public void drive(int miles)
	{
		currentRange = currentRange - miles; //current Range is decrease by the miles driven
	}
	//Gets the make of this ElectricCare
	public String getMake()
	{
		return make;
	}
	//Gets the number of miles the car can go on the current charge
	public int getCurrentRange()
	{
		return currentRange;
	}
	//Gets the maximum number of miles the car can go when fully charged 
	public int getMaxRange()
	{
		return maxRange;
	}
}
