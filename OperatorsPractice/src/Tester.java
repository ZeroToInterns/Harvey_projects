
public class Tester {

	public static void main(String[] args) {
//		System.out.println(Operations.Divide(4,3)); // call Operation so it knows which class is calling
		boolean myBoul = true || false; // there is one true so myBoul returns true (OR)
		boolean myExample = (10<9) ||(10>9);// there is one true so myExample is true (OR)
		boolean example2 = (10<9)&&(10>9); //there is one false so the returns false (AND)
//		System.out.println(myBoul);
//		System.out.println(Thermometer.measureTempture(90));
//		System.out.println(Thermometer.measureTempture(68));
//		System.out.println(Thermometer.measureTempture(59));
//		System.out.println(Greater.giveGrade(83));
//		System.out.println(Greater.giveGrade(76));
//		System.out.println(Greater.giveGrade(66));
//		System.out.println(Greater.giveGrade(52));
//		System.out.println(Greater.giveGrade(43));
//		System.out.println(Greater.giveGrade(98));
		Greater.respondToGrade('k');
	}

}
