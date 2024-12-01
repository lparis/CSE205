package iface;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)
	{
		new Main().run();
	}

	public void run()
	{
		ArrayList<MakesSound> critters = new ArrayList<>();
		critters.add(new Dog());
		critters.add(new Cat());
		critters.add(new Cricket());
		critters.add(new Cat());
		critters.add(new Cricket());
		beNoisy(critters);
	}
	
	public void beNoisy(ArrayList<MakesSound> pCritters) 
	{
		for (MakesSound critter : pCritters)
		{
			critter.makeSound();
		}
		
	}
}