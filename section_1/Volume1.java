
public class Volume1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cansPerPack = 6;
		final double CAN_VOLUME = 0.355; // Liters in 12-ounce can
		double totalVolume = cansPerPack * CAN_VOLUME;
		
		System.out.print("A six-pack of 12-ounce cans contains ");
		System.out.print(totalVolume);
		System.out.println(" liters.");
		
		final double BOTTLE_VOLUME = 2; // Two-liter bottle
		
		totalVolume = totalVolume + BOTTLE_VOLUME;
		
		System.out.print("A six-pack and a two-liter bottle contain ");
		System.out.print(totalVolume);
		System.out.println(" liters.");
		
	}

}
