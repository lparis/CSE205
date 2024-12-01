
public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringInt = "123";
		String stringDub = "456.78";
		Integer someInt = null;
		Double someDub = null;
		
		System.out.println(stringInt + stringDub);
		System.out.println(someInt.parseInt(stringInt) + someDub.parseDouble(stringDub));
		System.out.println(Integer.parseInt(stringInt) + Double.parseDouble(stringDub));
		
		//Integer(int 1);
		Integer I = new Integer(10);
		Integer J = new Integer("-4567");
		Integer K = new Integer(200);
		Integer L = new Integer(10);
		int b1 = I.compareTo(J);
		System.out.println(b1);
		int b2 = I.compareTo(K);
		System.out.println(b2);
		int b3 = J.compareTo(K);
		System.out.println(b3);
		int b4 = L.compareTo(I);
		System.out.println(b4);
		
		Double Z = new Double("25");
		
		String sd = "-4567";
		double xd = Double.parseDouble(sd);
		// Double.toString() not needed.
		System.out.println(xd);
		
		String si = "-4567";
		int xi = Integer.parseInt(si);
		// Integer.toString() not needed.
		System.out.println(xi);
	}
}
