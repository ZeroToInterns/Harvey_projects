
public class Thermometer {

	public static String measureTempture(int degree)
	{
		//check if temp is greater than 90
		if(degree >= 90) // 90+
		{
			return "Too hot"; // if it is greater than 90 then it returns Too hot 
		}
		else if (degree >60 && degree < 90) // between 60 - 90
		{
			return "Just Right";
		}
		else  // below 60
		{
			return "Too Cold";
		}
		
	}
	
}
