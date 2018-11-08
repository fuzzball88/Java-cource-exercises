public class TestClass {
    public static void main(String args[]) {
          Tool drill1, drill2, wrench;
          wrench = new Wrench(0.1, 4, 10);
          drill1 = new Drill(1.75, 175, "Black&Decker A", 1350);
          drill2 = new Drill(2, 250, "Black&Decker B", 3000);

          ((Wrench)wrench).printInfo();
          System.out.println();
          ((Drill)drill1).printInfo();
          System.out.println();
          ((Drill)drill2).printInfo();
    }
}

abstract class Tool {
    private double weight;
    private int price;
    
    public Tool(double p, int h) {
        weight = p;
        price = h; 
    }
    
    public double ReturnWeight() {
        return weight;
    }
    
    public int ReturnPrice() {
        return price;
    }
    
    public abstract void printInfo();
} 

class Wrench extends Tool{
	private int size;
	public Wrench(double w, int p, int s){
		size = s;
		super(w,p);
	}
	
	public void printInfo(){
		//System.out.println(super.returnName()+"("+super.returnID()+"): Amount paid "+amount+" euros.");
		System.out.println("Weight: "+super.ReturnWeight());
		System.out.println("Price: "+super.ReturnPrice());
		System.out.println("Size: "+size);
	}
}

class Drill extends Tool{
	private String model;
	private int maxSpeed;
	public Drill(double w, int p, String m,int s){
		model = m;
		maxSpeed = s;
		super(w,p);
	}
	
	public void printInfo(){
		//System.out.println(super.returnName()+"("+super.returnID()+"): Amount paid "+amount+" euros.");
		System.out.println("Weight: "+super.ReturnWeight());
		System.out.println("Price: "+super.ReturnPrice());
		System.out.println("Model: "+model);
		System.out.println("Revolution speed: "+maxSpeed);
	}
}




