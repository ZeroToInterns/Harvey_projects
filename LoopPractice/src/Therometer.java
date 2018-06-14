
public class Therometer {
	private double temperature;
	
	public void raiseTempeature(double temperature)
	{
		while (temperature < 90)
		{
			temperature++;
		}
		this.temperature = temperature;
	}
	
	
	
	public static void main(String[] args) {
		Therometer test = new Therometer();
		test.raiseTempeature(65);
		System.out.println(test.temperature);
		
	}
}
