
public class SubSandwich {
	public static final int CHICKEN = 0;
	public static final int PASTRAMI = 1;
	public static final double COST_FOR_EXTRA_MEAT = 1.50;
	private int type;
	private int size;
	private boolean extraMeat;
	private double cost;

	public SubSandwich(int theType, int theSize, boolean extraMeat)
	{
		type = theType;
		size = theSize;
		this.extraMeat = extraMeat;
	}
	
	public int getSize()
	{
		if (size != 6 && size != 12)
		{
			size = 12;
		}
		return size;
	}
	
	public void setSize(int newSize)
	{
		if (size != 6 && size != 12)
		{
			size = 12;
		}
		size = newSize;
	}
	
	public boolean isExtraMeat()
	{
		return extraMeat;
	}

	// get the type of sandwich 
	public String getType()
	{
		if (type == CHICKEN)
		{
			return "chicken"; 
		}
		else if (type == PASTRAMI)
		{
			return "pastrami";
		}
		else 
		{
			return "pastrami";
		}
	}
	
	public double getCost()
	{
		//size = 6 is assignment, size == is condition
		if (type == CHICKEN && size == 6)
		{
			cost = 5.50;
			if (extraMeat == true)
			{
				cost = cost + COST_FOR_EXTRA_MEAT;
			}
			return cost;
		}
		else if (type == CHICKEN && size == 12)
		{
			cost = 8.95;
			if (extraMeat == true)
			{
				cost = cost + COST_FOR_EXTRA_MEAT;
			}
			return cost;
		}
		//pastrami
		else if (type == PASTRAMI && size == 6)
		{
			cost = 6.95;
			if (extraMeat == true)
			{
				cost = cost + COST_FOR_EXTRA_MEAT;
			}
			return cost;
		}
		else if (type == PASTRAMI && size == 12)
		{
			cost = 9.50;
			if (extraMeat == true)
			{
				cost = cost + COST_FOR_EXTRA_MEAT;
			}
			return cost;
		}
		else 
		{
			cost = 9.50;
			if (extraMeat == true)
			{
				cost = cost + COST_FOR_EXTRA_MEAT;
			}
			return cost;
		}
	}
}