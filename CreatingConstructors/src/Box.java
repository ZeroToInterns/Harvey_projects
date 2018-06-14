
public class Box {

	private int width; 
	private int length;
	private int height;
	
	public Box(int theWidth, int theLength, int theHeight)
	{
		width = theWidth; 
		length = theLength; 
		height = theHeight; 
		
	}
	
	
	public static void main(String[] args) {
		Box myBox = new Box(5,9);
		myBox.getArea(); // calling the instance, non-Static
		//Or
		Box.getArea(5,9); //Calling the class, static. 
	}

}
