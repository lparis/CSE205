/**
 * @author lparis
 * Create a public class named H01_65 and write the class 
 * declaration for H01_65 that declares: 
 * (1) a private int instance variable named mX; 
 * (2) a private int class variable named mY initialized to 0; 
 * (3) a private int class constant named A which is equivalent to 100; 
 * (4) a public int class constant named B which is equivalent to 200; 
 * (5) public accessor and mutator methods for mX named getX() and setX(); 
 * (6) public accessor and mutator methods for mY named getY() and setY(); 
 * (7) a public constructor that has one int input parameter named pX that calls setX() to initialize mX to pX; 
 * (8) a public default constructor that calls H01_65(int) to initialize mX to -1.
 */

public class Tester_H01_65 
{
	// main() tester
	public static void main(String[] args) {
		H01_65 tester = new H01_65();
		System.out.println(tester.getX());
		System.out.println(tester.getY());
		tester.setX(33);
		tester.setY(22);
		System.out.println(tester.getX());
		System.out.println(tester.getY());
	}
}
