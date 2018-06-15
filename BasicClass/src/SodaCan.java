public class SodaCan {
	private double radius;
	private double height;
	public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;
	private double capacity;
	public SodaCan()
	{
		radius = 1.2109;
		height = 4.704;
		capacity = Math.PI * radius * radius * height* FLUID_OUNCES_PER_CUBIC_INCHES;
	}
	public SodaCan(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
		capacity = Math.PI * radius * radius * height* FLUID_OUNCES_PER_CUBIC_INCHES;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getHeight()
	{
		return height;
	}
	public void drink(double fluidOunces)
	{
		capacity = capacity - fluidOunces;
	}
	public double getContents()
	{
		return capacity;
	}
}