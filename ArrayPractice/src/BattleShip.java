
public class BattleShip {
	private boolean[][] grid;
	public BattleShip()
	{
		grid = new boolean[10][10];
	}
	
	public void placeFishingBoat(int x, int y)
	{
		grid[x][y] = true;	
	}
	
	public void printGrid()
	{
		for(int x = 0; x < grid.length; x++)
		{
			for(int y = 0; y < grid[x].length; y++)
			{
				System.out.print(grid[x][y]+ " ");
			}
			System.out.println("");
		}
	}
	public void placeCarrierBoat(int x, int y, String orientation)
	{
		try
		{
			if(orientation.equals("Vertical"))
			{
				for(int i = 0; i < 3; i++) //linear time because i is < than a constant number rather than dynamic 
				{
					grid[y + i][x] = true;
				}
			}
			else if(orientation.equals("Horizontal"))
			{
				for(int j = 0; j < 3; j++)
				{
					grid[y][y + j] = true;
				}
			}
			else 
			{
				System.out.println("Please put in a valid orientation");
			}
		}
		
		catch(IndexOutOfBoundsException e )
		{
			System.out.println("lol no ");
		}
	}
	
	public void attack(int x, int y)
	{
		if(grid[y][x] == true)
		{
			System.out.println("HIT");
		}
		else 
		{
			System.out.println("LOL U MISSED");
		}
	}
}
