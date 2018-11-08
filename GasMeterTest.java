import java.util.Scanner;

public class GasMeterTest {
    public static void main(String args[]) {   
        int answer = 1;
        boolean valueCorrect = true;
        GasMeter meter = new GasMeter();

        while (valueCorrect) {
            Scanner reader = new Scanner(System.in);
            
            System.out.print("What do you want: 1=95, 2=98, 3=Diesel " + 
                "(type any other number to quit): ");
            answer = reader.nextInt();
           
            if(answer >= 1 && answer <= 3) {
                System.out.print("How much do you want to refuel: ");
                double amount = reader.nextDouble();
                meter.refuel(answer, amount);
            } else {
                valueCorrect = false;
            }
        }
       
        GasMeter.totalUsed();
        GasMeter.totalUsed95();
        GasMeter.totalUsed98();
        GasMeter.totalUsedDi();
   }
}



class GasMeter{
private double total,e95,e98,diesel;
private static double stotal,se95,se98,sdiesel;
	
	private static void add95(double amount){
		se95+=amount;
		stotal+=amount;
	}
	private static void add98(double amount){
		se98+=amount;
		stotal+=amount;
	}
	private static void addiesel(double amount){
		sdiesel+=amount;
		stotal+=amount;
	}

	
	public void refuel(int type,double amount){	
	switch(type){
		case 1:
			e95+=amount;
			total+=amount;
			add95(amount);
			break;
		case 2:
			e98+=amount;
			total+=amount;
			add98(amount);
			break;
		case 3:
			diesel+=amount;
			total+=amount;
			addiesel(amount);
			break;		
		}
		
	}
	
		
		
	
	public static void totalUsed(){
		System.out.println("Total used fuel: "+stotal);
	}
	public static void totalUsed95(){
		System.out.println("Total used 95 octane fuel: "+se95);
	}
	public static void totalUsed98(){
		System.out.println("Total used 98 octane fuel: "+se98);
	}	
	public static void totalUsedDi(){
		System.out.println("Total used diesel fuel: "+sdiesel);
	}
}

