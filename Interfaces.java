import java.util.Scanner;

public class Interfaces {
    public static void main(String args[]) { 
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in the name of the soda: ");
        String name = reader.nextLine();
        
        System.out.print("Type in the volume of the bottle: ");
        double size = reader.nextDouble();
        
        SodaBottle soda = new SodaBottle(size, name);
        System.out.println(soda);
        soda.recycle();
    }
}

interface Recyclable {
   void recycle();
} 
class Bottle{
	private double volume;
	public Bottle(double size){
		volume = size;
	}
	public double returnVolume(){
	return volume;
	}
}
class SodaBottle extends Bottle implements Recyclable{
	private String name;
	public SodaBottle(double s,String n){
	super(s);
	name = n;
	}
	public String toString(){
		return name+", "+super.returnVolume()+" litres";
	}
	public void recycle(){
	System.out.println("Bottle returned for recycling.");
	}
} 


